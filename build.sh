#!/bin/bash

IMAGE=springboot

docker stop myapp

#mvn package -e -X docker:build -DskipTest

sleep 3s

docker run -d --rm -p 9090:8080 --name myapp  ${IMAGE}