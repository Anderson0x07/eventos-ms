package com.email.service;

import com.email.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public interface ClienteService {
    public void guardar(Cliente cliente);
}
