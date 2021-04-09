package com.hackaton.proveedores.controllers;

import java.util.List;

import com.hackaton.proveedores.persistence.model.Provider;
import com.hackaton.proveedores.persistence.repository.ProveedorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/providers")
class ProveedoresController {

    @Autowired
    private ProveedorRepository repository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Provider> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public Provider findById(@PathVariable("id") String id) {
       if(repository.findById(id).isPresent()){
           Provider provider = repository.findById(id).get();
           return provider;
       }
       throw new RuntimeException("Data not found");
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Provider create(@RequestBody Provider resource) {
        return repository.save(resource);
    }

    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void update(@PathVariable( "id" ) String id, @RequestBody Provider resource) {
        resource.setId(id);
        repository.save(resource);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") String id) {
        repository.deleteById(id);
    }

}
