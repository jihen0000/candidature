package com.enit.demo.dao;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.enit.demo.entities.Skill;

@RepositoryRestResource
public interface SkillRepository extends MongoRepository<Skill,String> {
	public List<Skill> findByUserName(String userName);

}
