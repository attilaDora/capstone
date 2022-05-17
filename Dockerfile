FROM openjdk:17

ENV ENVIROMENT=prod

LABEL maintainer="attila.dora92@gmail.com"

ADD backend/target/app.jar app.jar

CMD [ "sh", "-c", "java -Dserver.port=$PORT -jar /app.jar"]