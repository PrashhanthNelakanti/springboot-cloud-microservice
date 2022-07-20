#!/bin/bash

mvn clean install

ttab -t 'service-registry' -s Grass 'java -jar target/*.jar'
