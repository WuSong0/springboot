#!/bin/bash
docker images | grep springboot | grep latest
if [ $? -eq 0 ];then
   docker tag springboot:latest springboot:bak
fi
