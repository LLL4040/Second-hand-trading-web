# User guideline

## IntelliJ IDEA & tomcat

* step1: set the `defaultZone URL` in XXserver/application.yml to `http://localhost:9000/eureka/` except eurekaserver

* step2: run eurekaserverApplication

* step3: run rest server applications

* step4: input URL `http://localhost:9010/XX-server/url` to access the corresponding page. 
for example use `http://localhost:9010/goods-server/goods/getAllgoods` to get all goods.

## IntelliJ IDEA & Docker

* step1: set the `defaultZone URL` in XXserver/application.yml to `http://eureka-server:9000/eureka/` except eurekaserver

* step2: cd springcloud path and run `mvn clean package -D maven.test.skip=true docker:build` to build docker images

* step3: in docker shell input the commands following
    ```c
    $ docker network create -d bridge cloud
    $ docker run -p 9000:9000 -idt --name eureka-server --network cloud yourusername/Eureka
    ```
    and run the rest server images, too.

* step4: input URL to access the pages like above
