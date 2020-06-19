FROM openjdk:13-alpine
COPY . /app
WORKDIR /app
RUN chmod +x ./mvnw
VOLUME maven-repo:/root/.m2
VOLUME /data/apps/testing/testdocker
ENTRYPOINT ["./mvnw"]
CMD ["spring-boot:run"]