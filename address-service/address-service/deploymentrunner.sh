#!/bin/sh
DOCKER_DEFAULT_PLATFORM="linux/amd64" docker build -t address-service .
docker tag address-service sureshk89/address-service:1.0.0
docker push sureshk89/user-service:1.0.0
kubectl apply -f deployment.yaml