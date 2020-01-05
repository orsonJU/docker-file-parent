# 基于openjdk8 来创建iamge
FROM openjdk:8-slim

# 维护者信息
MAINTAINER orson.h.s.zhu

# 复制sprintboot的jar到指定目录
COPY target/image-from-container-0.0.1-SNAPSHOT.jar /usr/local/jar/

# 运行命令，对vim进行安装
RUN	yum install -y vim

# 运行springboot
CMD ["java", "-jar", "/usr/local/jar/image-from-container-0.0.1-SNAPSHOT.jar"];

