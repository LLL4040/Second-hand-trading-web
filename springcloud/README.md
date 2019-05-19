# User guidline

## 方法1：在IntelliJ IDEA中使用tomcat运行

* step1: 
    将除了`eurekaserver`之外的每一个服务的`application.yml`配置文件中`defaultZone`的URL改为`http://localhost:9000/eureka/`
* step2: 
    点击绿三角运行所有的服务

## 方法2：在docker容器中运行

* step1: 
    将除了`eurekaserver`之外的每一个服务的`application.yml`配置文件中`defaultZone`的URL改为`http://eureka-server:9000/eureka/`
* step2: 
    在cmd中cd到各个服务的文件目录下分别运行`mvn clean package -D maven.test.skip=true docker:build`创建对应的docker image
* step3: 
    在docker shell里面依次输入以下命令

```bash
$ docker network create -d bridge cloud
$ docker run -p 9000:9000 -idt --name eureka-server --network cloud lyl4040/eurekaserver
$ docker run -p 9001:9001 -idt --name provider --network cloud lyl4040/servicedemo
$ docker run -p 9002:9002 -idt --name consumer --network cloud lyl4040/servicehi
```

## 访问

* 输入 http://localhost:9000 访问注册中心
* 输入 http://localhost:9001/demo?name=233 访问生产者端(参数自拟)
* 输入 http://localhost:9002/hi?name=233 访问消费者端(参数自拟)
* 如果生产者服务没有运行，访问消费者端会调用断路器的fallback返回提示信息
* 如果是在虚拟机里运行docker，需要把localhost换成docker宿主机的ip