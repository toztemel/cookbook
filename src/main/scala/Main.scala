import scala.concurrent.Future

import akka.actor.ActorSystem
import akka.http.scaladsl.Http
import akka.stream.ActorMaterializer
import org.neo4j.driver.v1.{AuthTokens, GraphDatabase}
import neotypes.implicits._

import scala.concurrent.{ExecutionContext, Future}

object Main extends App {

  val uri = "bolt://localhost:7687"
  val user = "neq4j"
  val password = "password"

  def startApplication() = {
    implicit val actorSystem = ActorSystem()
    implicit val executor: ExecutionContext = actorSystem.dispatcher
    implicit val materializer: ActorMaterializer = ActorMaterializer()

    val config = Config.load()

    val driver = GraphDatabase.driver(config.database.url, AuthTokens.basic(config.database.username, config.database.password))

    val movieService = new MovieService(driver.asScala[Future])
    val httpRoute = new MovieRoute(movieService)

    Http().bindAndHandle(httpRoute.route, config.http.host, config.http.port)

    Runtime.getRuntime().addShutdownHook(new Thread(() =>
      driver.close()
    ))
  }

  startApplication()
}