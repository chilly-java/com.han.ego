package com.bjsxt.backend.item;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * BackendItem服务
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class BackendItemApplication {
    public static void main(String[] args){
        SpringApplication.run(BackendItemApplication.class,args);
    }
}
