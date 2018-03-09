#!/bin/bash

IMAGE=springboot

USER root

echo "visenergy" | sudo -S docker stop myapp

#mvn package -e -X docker:build -DskipTest

sleep 3s

echo "visenergy" | sudo -S docker run -d -p 9090:8080 --name myapp  ${IMAGE}