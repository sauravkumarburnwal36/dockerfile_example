FROM  eclipse-temurin:21

WORKDIR /app

#COPY ./target/product-service-0.0.1-SNAPSHOT.jar .
#
#EXPOSE 8080
#
#CMD ["java","-jar","product-service-0.0.1-SNAPSHOT.jar"]

COPY .mvn/ .mvn

COPY mvnw pom.xml ./

RUN ./mvnw dependency:go-offline

COPY src ./src

CMD ["./mvnw","spring-boot:run"]
