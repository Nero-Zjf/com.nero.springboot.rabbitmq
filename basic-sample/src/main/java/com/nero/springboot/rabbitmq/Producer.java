package com.nero.springboot.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 生产者
 */
@Component
public class Producer {
    @Autowired
    private AmqpTemplate template;

    public void send(String msg) {
        System.out.println("发送消息：" + msg);
        //简单对列的情况下routingKey即为Q名
        template.convertAndSend("springboot_queue", msg);
    }
}
