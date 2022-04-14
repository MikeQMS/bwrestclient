FROM adoptopenjdk/openjdk11
ENV APP_HOME=/usr/app/
WORKDIR $APP_HOME
COPY ./target/BW-RestClient-0.0.1-SNAPSHOT.jar /usr/app/
EXPOSE 1234
CMD ["java", "--add-opens=java.base/java.lang=ALL-UNNAMED", "-jar", "BW-RestClient-0.0.1-SNAPSHOT.jar"]