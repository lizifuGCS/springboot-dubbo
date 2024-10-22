package com.qst.bootconsumer;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class BootConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootConsumerApplication.class, args);
    }

}
