package com.hungles.spring_boot_microservices_1_inmueble.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hungles.spring_boot_microservices_1_inmueble.model.Inmueble;

@Repository
public interface InmuebleRepository extends JpaRepository<Inmueble, Long> {

    public List<Inmueble> findByNombre(String nombre);

}
