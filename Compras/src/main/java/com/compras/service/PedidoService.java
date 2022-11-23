package com.compras.service;

import com.compras.model.Pedido;
import com.compras.repository.PedidoRepository;
import com.compras.service.rabbitmq.Producer;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class PedidoService {

    private final PedidoRepository pedidoRepository;
    private final Producer producer;

    public Pedido salvar(Pedido pedido){
        pedido = pedidoRepository.save(pedido);
        producer.enviarPedido(pedido);
        return pedido;

    }
}
