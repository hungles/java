package com.hungles.spring_boot_microservices_1_inmueble.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hungles.spring_boot_microservices_1_inmueble.model.Inmueble;
import com.hungles.spring_boot_microservices_1_inmueble.service.InmuebleService;

import jakarta.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api/inmueble")
public class InmuebleController {

    @Autowired
    private InmuebleService inmuebleService;

    @PostMapping()
    public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
        
        return new ResponseEntity<>(
            inmuebleService.saveInmueble(inmueble) ,
            HttpStatus.CREATED
        );

    }

    //http://localhost:3333/api/inmueble/1
    @DeleteMapping("{inmuebleId}")
    public ResponseEntity<?> deleteInmueble(@PathVariable Long inmuebleId) {
        
        inmuebleService.deleteInmueble(inmuebleId);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    //http://localhost:3333/api/inmueble
    @GetMapping()
    public ResponseEntity<?> getAllInmueble() {
        return new ResponseEntity<>(
            inmuebleService.findAllInmuebles(),
            HttpStatus.OK
        );
    }
    //http://localhost:3333/api/inmueble/1
    @PostMapping("{inmuebleId}")
    public ResponseEntity<?> updateInmueble(@PathVariable Long inmuebleId, @RequestBody Inmueble inmueble) {
        
        return  new ResponseEntity<>(
            inmuebleService.updateInmueble(inmuebleId, inmueble),
            HttpStatus.OK);
    }

    @GetMapping("{inmuebleId}")
    public ResponseEntity<?> getByInmuebleId(@PathVariable Long inmuebleId ) {

        return new ResponseEntity<>(
            inmuebleService.findInmuebleById(inmuebleId),
            HttpStatus.OK
        );
    }

    @GetMapping("/admin/{nombre}")
    public ResponseEntity<?> getAllInmueblesByNombre(@PathVariable String nombre) {
        return new ResponseEntity<>(
            inmuebleService.showAllInmueblesByNombre(nombre),
            HttpStatus.OK
        );
    }
    
    

}
