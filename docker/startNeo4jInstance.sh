#!/bin/sh

# https://neo4j.com/docs/operations-manual/current/docker/introduction/

echo "Go to http://localhost:7474"
echo "username: neo4j"
echo "password: password"
docker run --publish=7474:7474 --publish=7687:7687 --volume=/Users/tayfun/Projects/personal/cookbook/data/neo4j/data:/data --volume=/Users/tayfun/Projects/personal/cookbook/neo4j/logs:/logs neo4j

# as non-root
# docker run \
#    --publish=7474:7474 --publish=7687:7687 \
#    --volume=$HOME/neo4j/data:/data \
#    --volume=$HOME/neo4j/logs:/logs \
#    --user="$(id -u):$(id -g)" \
#    --env=NEO4J_ACCEPT_LICENSE_AGREEMENT=yes
#    neo4j:3.5

