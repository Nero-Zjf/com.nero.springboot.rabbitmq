package com.nero.springboot.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    //配置队列
    @Bean
    public Queue queue() {
        return new Queue("springboot_queue");
    }
}
