package com.enit.demo.dao;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Candidat;


@RepositoryRestResource
public interface candidatRepository extends MongoRepository<Candidat, String> {
    public Candidat findByCandidatCin(int cin);


}
