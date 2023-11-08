package com.puntoslealtad.service;

import com.puntoslealtad.entity.Puntos;
import org.springframework.stereotype.Service;

@Service
public interface PuntosService {
    void guardar(Puntos puntos);
}
