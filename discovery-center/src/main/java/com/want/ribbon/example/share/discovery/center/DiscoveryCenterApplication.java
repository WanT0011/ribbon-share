package com.want.ribbon.example.share.discovery.center;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author want
 * @createTime 2020.10.21.22:42
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryCenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(DiscoveryCenterApplication.class,args);
    }
}
