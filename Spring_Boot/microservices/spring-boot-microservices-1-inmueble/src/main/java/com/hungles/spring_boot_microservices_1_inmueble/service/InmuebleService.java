package com.hungles.spring_boot_microservices_1_inmueble.service;

import java.util.List;

import com.hungles.spring_boot_microservices_1_inmueble.model.Inmueble;

public interface InmuebleService {

    public List<Inmueble> findAllInmuebles();
    public Inmueble saveInmueble(Inmueble inmueble);
    public void deleteInmueble(Long inmuebleId);
    public Inmueble updateInmueble(Long inmuebleId, Inmueble inmueble);
    public Inmueble findInmuebleById(Long inmuebleId);
    public List<Inmueble> showAllInmueblesByNombre(String nombre);
}
