package com.entrega.service;

import com.entrega.entity.Envio;
import org.springframework.stereotype.Service;

@Service
public interface EnvioService {
    public void guardar(Envio envio);
}
