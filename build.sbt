
scalaVersion := "2.12.8"

name := "cookbook"
organization := "toztemel"
version := "1.0"

//val slickVersion = "3.2.3"
//val sttpV = "1.1.13"

lazy val akkaHttp = (project in file("."))
  .settings(
    libraryDependencies ++= Seq(
      "com.typesafe.akka" %% "akka-http" % "10.1.3",
      "com.typesafe.akka" %% "akka-http-core" % "10.1.3",

      "ch.megard" %% "akka-http-cors" % "0.3.0",
      "com.github.pureconfig" %% "pureconfig" % "0.9.1",

      "io.circe" %% "circe-core" % "0.9.3",
      "io.circe" %% "circe-generic" % "0.9.3",
      "io.circe" %% "circe-parser" % "0.9.3",

      // Sugar for serialization and deserialization in akka-http with circe
      "de.heikoseeberger" %% "akka-http-circe" % "1.20.1",

      "com.dimafeng" %% "neotypes" % "0.4.0",

      "org.scalatest" %% "scalatest" % "3.0.5" % Test
    )
  )