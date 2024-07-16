FROM maven
WORKDIR /usr/src/app
COPY . .
RUN mvn install
FROM openjdk
COPY --from=common:v1 /usr/src/app/rest-client/target/*.jar ./
