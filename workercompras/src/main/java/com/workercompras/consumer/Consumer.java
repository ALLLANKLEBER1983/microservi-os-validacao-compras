package com.workercompras.consumer;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.workercompras.model.Pedido;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.core.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.io.IOException;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Component
public class Consumer {

    private final ObjectMapper mapper;

    @RabbitListener(queues = {"${queue.name}"})
    public void consumer(@Payload Message message) throws IOException {
        var pedido = mapper.readValue(message.getBody(), Pedido.class);
        System.out.println("Mensagem recebida no WorkerCompras: " + pedido);
    }

}
