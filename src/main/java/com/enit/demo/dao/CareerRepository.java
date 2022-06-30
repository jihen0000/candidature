package com.enit.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Career;

@RepositoryRestResource
public interface CareerRepository extends MongoRepository<Career,String> {
	public List<Career> findCarByuserName(String userName);

}
