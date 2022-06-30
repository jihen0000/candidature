package com.enit.demo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.PathVariable;

import com.enit.demo.entities.Skill;

public interface SkillService {

	  public String addComp(Skill skill);

	    public List<Skill> removeComp(String username);

	    public void updateComp(Skill skill);

	    public List<Skill> findByusername(String username);
	    
	    

	    public List<Skill> getAllSkills();
	}


