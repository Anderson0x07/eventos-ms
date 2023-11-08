package com.email.implement;

import com.email.entity.Cliente;
import com.email.repository.ClienteRepository;
import com.email.service.ClienteService;
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
