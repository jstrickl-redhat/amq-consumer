package com.redhat.amqconsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jms.JmsAutoConfiguration;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication(exclude = {JmsAutoConfiguration.class})
@EnableJms
public class AmqConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(AmqConsumerApplication.class, args);
    }

}
