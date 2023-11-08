package com.email.consumer;

import com.email.service.EmailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class Consumer {

    @Autowired
    private EmailService emailService;

    @RabbitListener(queues = { "${sacavix.queue.name}" })
    public void receive(@Payload String msj) {

        log.info("Received message {}", msj);

        emailService.envioEmail();

    }

}
