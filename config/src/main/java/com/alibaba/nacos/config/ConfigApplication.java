package com.alibaba.nacos.config;

import com.alibaba.nacos.api.config.annotation.NacosConfigListener;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.concurrent.TimeUnit;

@SpringBootApplication
public class ConfigApplication {

    public static void main(String[] args) throws InterruptedException {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ConfigApplication.class, args);
//        while(true) {
//            //When configurations are refreshed dynamically, they will be updated in the Enviroment, therefore here we retrieve configurations from Environment every other second.
//            String userName = applicationContext.getEnvironment().getProperty("user.name");
//            String userAge = applicationContext.getEnvironment().getProperty("user.age");
//            System.err.println("user name :" + userName + "; age: " + userAge);
//            TimeUnit.SECONDS.sleep(1);
//        }
    }

}
