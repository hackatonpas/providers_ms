package com.hackaton.pas.persistence.repository;

import com.hackaton.pas.persistence.model.Provider;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "providers", path = "providers")
public interface ProviderRepository extends MongoRepository<Provider, String> {

    //Ejemplo para buscar por un parametro de la entidad
    //Provider findByNombre(@Param("nombre") String nombre);
    Provider findByNombre(@Param("nombre") String nombre);

}
