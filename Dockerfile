# This is a Dockerfile
FROM ubuntu
MAINTAINER developer.session@gmail.com
RUN apt-get update
RUN apt-get install -y nginx
#CMD ["echo", "image created"]