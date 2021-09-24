FROM openjdk:8
MAINTAINER Some Dev

RUN mkdir /app
WORKDIR /app

COPY wait-for-it.sh /wait-for-it.sh
RUN chmod +x /wait-for-it.sh
