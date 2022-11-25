FROM maven:3.6.3-openjdk-11 as build
COPY src /home/app/src
COPY pom.xml /home/app
RUN mvn -f /home/app/pom.xml clean package -Dmaven.test.skip=true

FROM openjdk:11
COPY --from=build /home/app/target/app.war /user/local/lib/app.war
EXPOSE 8080
ENTRYPOINT ["java","-jar","/user/local/lib/app.war"]


