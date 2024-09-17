package com.hungles.spring_boot_microservices_1_inmueble.service;

import java.time.LocalDateTime;
import java.util.List;


import org.springframework.stereotype.Service;

import com.hungles.spring_boot_microservices_1_inmueble.model.Inmueble;
import com.hungles.spring_boot_microservices_1_inmueble.repository.InmuebleRepository;

@Service
public class InmuebleServiceImpl implements InmuebleService {

    
    private final InmuebleRepository inmuebleRepository;

    public InmuebleServiceImpl(InmuebleRepository inmuebleRepository){
        this.inmuebleRepository = inmuebleRepository;
    }

    //Guardar Inmueble
    @Override
    public Inmueble saveInmueble(Inmueble inmueble){

        inmueble.setFechaCreacion(LocalDateTime.now());
        return inmuebleRepository.save(inmueble);
        
    }

    //Eliminar Inmueble
    @Override
    public void deleteInmueble(Long inmuebleId){
        inmuebleRepository.deleteById(inmuebleId);
    }

    //Mostrar todos los inmuebles
    @Override
    public List<Inmueble> findAllInmuebles(){
        return inmuebleRepository.findAll();
    }

    @Override
    public Inmueble updateInmueble(Long inmuebleId, Inmueble inmueble){
        
        Inmueble newInmueble = inmuebleRepository.findById(inmuebleId).orElse(null);
        if (inmuebleId != null){
            newInmueble.setNombre(inmueble.getNombre());
            newInmueble.setDireccion(inmueble.getDireccion());
            newInmueble.setPicture(inmueble.getPicture());
            newInmueble.setPrecio(inmueble.getPrecio());
        }
        else {
            return null;
        }

        return inmuebleRepository.save(newInmueble);
    }

    @Override
    public Inmueble findInmuebleById(Long inmuebleId){
        return inmuebleRepository.findById(inmuebleId).orElse(null);
    }

    @Override
    public List<Inmueble> showAllInmueblesByNombre(String nombre){
        return inmuebleRepository.findByNombre(nombre);        
    }
}

