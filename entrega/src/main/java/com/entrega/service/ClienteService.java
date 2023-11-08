package com.entrega.service;

import com.entrega.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    public void guardar(Cliente cliente);
}
