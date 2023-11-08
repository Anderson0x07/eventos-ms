package com.entrega.implement;

import com.entrega.entity.Envio;
import com.entrega.repository.EnvioRepository;
import com.entrega.service.EnvioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnvioServiceImpl implements EnvioService {

    @Autowired
    private EnvioRepository envioRepository;

    @Override
    public void guardar(Envio envio) {
        envioRepository.save(envio);
    }
}
