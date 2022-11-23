package com.compras.service.rabbitmq;

import com.compras.model.Pedido;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;



@Component
public class Consumer {

    @RabbitListener(queues = {"${queue.name}"})
    public void consumer(@Payload Pedido payload){
        System.out.println("Mensagem recebida "+payload);

    }
}
