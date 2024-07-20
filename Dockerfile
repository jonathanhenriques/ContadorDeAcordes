# Etapa de construção
FROM ubuntu:latest AS build

# Atualizar pacotes e instalar OpenJDK 11 e Maven
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk \
    maven

# Copiar o código-fonte para o contêiner
COPY . .

# Compilar o projeto usando Maven
RUN mvn clean install

# Etapa de execução
FROM openjdk:11-jdk-slim

# Expor a porta em que o aplicativo será executado
EXPOSE 8080

# Copiar o JAR construído da etapa anterior para a nova imagem
COPY --from=build /target/deploy_render-1.0.0.jar app.jar

# Definir o comando de entrada para executar o aplicativo
ENTRYPOINT [ "java", "-jar", "app.jar" ]
