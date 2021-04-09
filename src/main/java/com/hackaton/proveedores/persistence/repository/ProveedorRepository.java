package com.hackaton.proveedores.persistence.repository;

import com.hackaton.proveedores.persistence.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "providers", path = "providers")
public interface ProveedorRepository extends MongoRepository<Provider, String> {

    Provider findByNombre(@Param("nombre") String nombre);
}
