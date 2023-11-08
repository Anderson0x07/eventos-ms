package com.entrega.implement;

import com.entrega.entity.Cliente;
import com.entrega.repository.ClienteRepository;
import com.entrega.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Override
    public void guardar(Cliente cliente) {
        clienteRepository.save(cliente);
    }
}
