package com.email.controller;

import com.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmailController {
    @Autowired
    private EmailService emailService;

    @PostMapping("/bienvenida")
    public ResponseEntity<String> guardarCliente() {
        String rta = emailService.envioEmail();
        return new ResponseEntity<>(rta, HttpStatus.OK);
    }
}
