package com.entrega.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "envio")
public class Envio implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "clienteId", nullable = false)
    private Long clienteId;

    @Column(name = "contenido", nullable = false)
    private String contenido;
}
