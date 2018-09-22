FROM java:8-jre
WORKDIR /app
ADD target/ci-demo.jar /app
CMD ["java", "-jar", "-agentlib:jdwp=transport=dt_socket,address=50500,suspend=n,server=y", "ci-demo.jar"]