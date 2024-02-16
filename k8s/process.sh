#!/bin/bash
export $(cat .env | xargs)

envsubst < deployment.yaml > deployment-envsubst.yaml


cat .env | while read line; do
    export $line
    echo $line
done
