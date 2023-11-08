package com.puntoslealtad.repository;

import com.puntoslealtad.entity.Puntos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PuntosRepository extends JpaRepository<Puntos, Long> {
}
