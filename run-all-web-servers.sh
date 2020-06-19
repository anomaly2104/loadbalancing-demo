#!/bin/bash
nohup java -jar -Dserver.port=8081 target/loadbalancing-demo-0.0.1-SNAPSHOT.jar > log8081.log &
nohup java -jar -Dserver.port=8082 target/loadbalancing-demo-0.0.1-SNAPSHOT.jar > log8082.log &
nohup java -jar -Dserver.port=8083 target/loadbalancing-demo-0.0.1-SNAPSHOT.jar > log8083.log &
nohup java -jar -Dserver.port=8084 target/loadbalancing-demo-0.0.1-SNAPSHOT.jar > log8084.log &
