### cookbook
Recommendation engine for food recipes

* FE-User:  Play
* FE-Admin: Play
* BE: Scala   
  * Akka Streams  
  * Akka Http
* DB: Neo4J  

###### Run neo4j
```
$ cd ./docker
$ docker-compose up
```
See https://medium.com/neo4j/neotypes-part-1-akka-http-neo4j-6cab38d077d4

###### Run app
`$ sbt run`

Search: http://localhost:9000/index.html  
Edit:   http://localhost:9000/admin.html

###### Driver: NEOTYPES  
    https://github.com/neotypes/neotypes
    https://neotypes.github.io/neotypes/docs.html
    http://dimafeng.com/2018/12/27/neotypes-1/
    https://github.com/neotypes/examples
    https://medium.com/neo4j/neotypes-part-1-akka-http-neo4j-6cab38d077d4
    
