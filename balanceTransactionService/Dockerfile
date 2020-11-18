FROM openjdk:11
WORKDIR /Users/max_slob/git/BalanceTransactionService
COPY target/balanceTransactionService-0.0.1-SNAPSHOT.jar service.jar
EXPOSE 8085
CMD ["java", "-jar", "service.jar"]