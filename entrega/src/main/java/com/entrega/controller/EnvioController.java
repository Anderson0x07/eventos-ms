package com.entrega.controller;

import com.entrega.entity.Envio;
import com.entrega.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvioController {
    @Autowired
    private EnvioService envioService;

    @PostMapping("/guardar")
    public ResponseEntity<String> guardarEntrega(@RequestBody Envio envio) {
        envioService.guardar(envio);
        return new ResponseEntity<>("Entrega guardada con éxito", HttpStatus.CREATED);
    }
}
