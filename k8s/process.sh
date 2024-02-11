#!/bin/bash
export $(cat .env | xargs)

envsubst < deployment.yaml > deployment-envsubst.yaml