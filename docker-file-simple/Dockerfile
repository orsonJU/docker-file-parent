# 基于openjdk8的image进行创建
FROM openjdk:8-slim

# 维护者
MAINTAINER orson.h.s.zhu

# 将当前的springboot项目复制到/usr/local/目录下面
COPY target/docker-file-simple-0.0.1-SNAPSHOT.jar /usr/local/

# 运行项目
CMD ["java", "-jar", "/usr/local/docker-file-simple-0.0.1-SNAPSHOT.jar"]


