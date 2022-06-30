package com.enit.demo.services;

import java.util.List;

import com.enit.demo.entities.Career;

public interface CareerService {

	    public String addCarr(Career career);

	    public List<Career> removeCarr(String userName);

	    public void updateCarr(Career career);
	   

	    public List <Career> findCarByuserName(String userName);

	    public List<Career> getAllCareer();
	    
	    
	   
	}


