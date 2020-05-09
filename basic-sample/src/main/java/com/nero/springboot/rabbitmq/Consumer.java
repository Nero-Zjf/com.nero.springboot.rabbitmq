package com.nero.springboot.rabbitmq;


import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * 消费者
 */
@Component
@RabbitListener(queues = "springboot_queue")//声明监听的队列
public class Consumer {
    @RabbitHandler
    public void listen(String msg) {
        System.out.println("接收消息  : " + msg);
    }
}
