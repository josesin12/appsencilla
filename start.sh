#!/bin/bash
# Forzar Java en cualquier entorno
export JAVA_HOME=/usr/lib/jvm/java-17-openjdk
export PATH=$JAVA_HOME/bin:$PATH

# Ejecutar la app Spring Boot
java -jar target/*.jar
