#!/bin/bash

mvn clean install

ttab -t 'cloud-gateway' -s Grass 'java -jar target/*.jar'