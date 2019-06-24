package com.example.servicedemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableEurekaClient
@RestController
public class ServicedemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServicedemoApplication.class, args);
    }

    @Value("${server.port}")
    String port;

    @RequestMapping("/demo")
    public String home(@RequestParam String name) {
        return "Hi " + name + ", I am from port: " + port;
    }

}
