#!/bin/bash

IMAGE=spring_cloud_app

ssh root@192.168.100.100
docker stop myapp

#mvn package -e -X docker:build -DskipTest

sleep 3s

docker run -d -p 9090:8080 --name myapp  ${IMAGE}