package com.entrega.controller;

import com.entrega.entity.Cliente;
import com.entrega.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {
    @Autowired
    private ClienteService clienteService;


    @PostMapping("/guardar")
    public ResponseEntity<String> guardarCliente(@RequestBody Cliente cliente) {
        clienteService.guardar(cliente);
        return new ResponseEntity<>("Cliente guardado", HttpStatus.CREATED);
    }
}
