package com.puntoslealtad.controller;

import com.puntoslealtad.entity.Puntos;
import com.puntoslealtad.service.PuntosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PuntosController {
    @Autowired
    private PuntosService puntosService;


    @PostMapping("/guardar")
    public ResponseEntity<String> crearPuntos(@RequestBody Puntos puntos) {
        puntosService.guardar(puntos);
        return new ResponseEntity<>("Puntos de lealtad creados para el cliente: "+puntos.getClienteId(), HttpStatus.CREATED);
    }
}
