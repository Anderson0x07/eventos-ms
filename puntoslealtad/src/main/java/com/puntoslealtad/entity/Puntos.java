package com.puntoslealtad.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "puntos")
public class Puntos implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "clienteId", nullable = false)
    private Long clienteId;

    @Column(name = "puntos", nullable = false)
    private Integer puntos;
}
