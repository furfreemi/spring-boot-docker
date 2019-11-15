1.) Generate the jar file:
`./gradlew bootJar`

2.) Create the docker image including this jar:
` docker build --build-arg JAR_FILE=build/libs/spring-boot-docker-0.0.1.jar -t spring-boot-docker-demo .`

3.) Run!:
`docker run -p 8080:8080 spring-boot-docker-demo:latest`

4.) Profit.