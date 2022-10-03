package com.atguigu.boot02;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableAdminServer
@SpringBootApplication
public class Boot02Application {

    public static void main(String[] args) {
        SpringApplication.run(Boot02Application.class, args);
        System.out.println("test");
    }

}
