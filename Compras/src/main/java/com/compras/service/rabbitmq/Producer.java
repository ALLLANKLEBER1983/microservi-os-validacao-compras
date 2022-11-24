package com.compras.service.rabbitmq;

import com.compras.model.Pedido;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;



@Service
public class Producer {
    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private ObjectMapper mapper;

    @Autowired
    private Queue queue;

    @SneakyThrows
    @PostMapping
    public void enviarPedido(Pedido pedido){
        rabbitTemplate.convertAndSend(queue.getName(),mapper.writeValueAsString(pedido));

    }


}
