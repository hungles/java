package com.hungles.spring_boot_microservices_1_inmueble.model;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "inmueble")
public class Inmueble {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inmuebleId;

    @Column(name = "nombre", length = 150, nullable = false)
    private String nombre;

    @Column(name = "direccion", length = 500, nullable = false)
    private String direccion;

    @Column(name = "foto", length = 1200, nullable = true)
    private String picture;

    @Column(name = "precio", nullable = false)
    private double precio;

    @Column(name = "fecha_creacion", nullable = false)
    private LocalDateTime fechaCreacion;

}
