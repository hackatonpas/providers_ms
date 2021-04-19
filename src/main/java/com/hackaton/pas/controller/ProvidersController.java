package com.hackaton.pas.controller;

import java.util.List;

import com.hackaton.pas.persistence.model.Provider;
import com.hackaton.pas.persistence.repository.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value="/providers")
class ProvidersController {

    @Autowired
    private ProviderRepository repository;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Provider> findAll() {
        return repository.findAll();
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Provider> findById(@PathVariable("id") String id) {
        Provider provider = repository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("Provider not found for this id :: " + id));
        return ResponseEntity.ok().body(provider);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.CREATED)
    public Provider create(@RequestBody Provider resource) {
        return repository.save(resource);
    }

    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public ResponseEntity<Provider> update(@PathVariable( "id" ) String id, @RequestBody Provider provider) {
        provider.setId(id);
        Provider updatedProvider = repository.save(provider);
        return ResponseEntity.ok(updatedProvider);
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable("id") String id) {
        repository.deleteById(id);
    }

}
