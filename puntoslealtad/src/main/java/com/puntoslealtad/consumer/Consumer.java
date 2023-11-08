package com.puntoslealtad.consumer;

import com.puntoslealtad.entity.Puntos;
import com.puntoslealtad.service.PuntosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @Autowired
    private PuntosService puntosService;

    @RabbitListener(queues = { "${sacavix.queue.name}" })
    public void receive(@Payload Long clienteId) {

        log.info("Puntos de lealtad message {}", clienteId);

        Puntos puntos = new Puntos();

        puntos.setClienteId(clienteId);
        puntos.setPuntos(0);

        if(clienteId != null) {
            puntosService.guardar(puntos);

        }

    }

}
