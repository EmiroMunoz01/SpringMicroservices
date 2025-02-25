package com.microservice.students;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

//con esta anotacion indicamos que este servicio sera un cliente de eureka
@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceStudentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceStudentsApplication.class, args);
    }

}
