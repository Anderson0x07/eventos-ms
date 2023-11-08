package com.cliente.implement;

import com.cliente.entity.Cliente;
import com.cliente.publisher.Publisher;
import com.cliente.repository.ClienteRepository;
import com.cliente.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteServiceImpl implements ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private Publisher publisher;

    @Override
    public void guardar(Cliente cliente) {
        Cliente clienteSaved = clienteRepository.save(cliente);

        publisher.send(clienteSaved.getId());

    }
}
