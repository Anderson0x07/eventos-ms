package com.cliente.service;

import com.cliente.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    public void guardar(Cliente cliente);
}
