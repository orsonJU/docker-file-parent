目标：
1. 尝试写一个Dockerfile，创建一个可以提供当前项目（docker-file-simple）运行的镜像，要求如下：
	* 镜像需要基于openjdk:8-slim来创建，以便提供java运行时的支持。
	* 项目运行的jar需要放置在/usr/local/docker-file-simple下
	* 在宿主机器上可以通过8080端口访问接口：docker/simple
	
	
完成后可以参考Dockerfile_answer