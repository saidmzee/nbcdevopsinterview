FROM eclipse-temurin:17 as build
WORKDIR /opt/app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:go-offline
COPY ./src ./src
RUN ./mvnw package -Dmaven.test.skip

FROM eclipse-temurin:17
WORKDIR /opt/app
EXPOSE 909
COPY --from=build /opt/app/target/*.jar /opt/app/*.jar
COPY --from=build /opt/app/target/classes /opt/app/classes
ENTRYPOINT ["java", "-jar", "/opt/app/*.jar" ]
