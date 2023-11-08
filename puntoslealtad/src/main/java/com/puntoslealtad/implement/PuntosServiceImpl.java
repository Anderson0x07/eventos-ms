package com.puntoslealtad.implement;

import com.puntoslealtad.entity.Puntos;
import com.puntoslealtad.repository.PuntosRepository;
import com.puntoslealtad.service.PuntosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PuntosServiceImpl implements PuntosService {

    @Autowired
    private PuntosRepository puntosRepository;

    @Override
    public void guardar(Puntos puntos) {
        puntosRepository.save(puntos);
    }
}
