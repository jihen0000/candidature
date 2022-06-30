package com.enit.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.enit.demo.dao.CareerRepository;

import com.enit.demo.entities.Career;
@CrossOrigin(origins = "*")
@RestController

public class CareerServiceImpl implements CareerService {
	 @Autowired
	    public CareerRepository careerRepository;

	    @Override
	    @ResponseBody
	    @PostMapping(path="/addCarr")
	    public String addCarr(@RequestBody Career career)
	    {
	       careerRepository.save(career);
	        return "career added";
	    }
	    
	    @Override
	    @DeleteMapping("/removeCarr/{userName}")
	    @ResponseBody
	    public List<Career> removeCarr(@PathVariable("userName") String userName){
	        System.out.println("In removeCarr : ");
	        careerRepository.deleteById(userName);
	        System.out.println("Out of removeCarr : ");
	        return careerRepository.findAll();
	    }
	    @Override
	    @PutMapping("/updateCarr")
	    @ResponseBody
	    public void updateCarr(Career career){
	    	System.out.println("In updateCarr");
	        careerRepository.save(career);
	        System.out.println("Out of updateCarr : ");
	    }
	   
	    @Override
	    @GetMapping("/findCarr/{userName}")
	    @ResponseBody
	    public List <Career> findCarByuserName(@PathVariable("userName") String userName){
	    	System.out.println("In findCarr : ");
	    	return careerRepository.findCarByuserName(userName);
	        //return findCarByuserName(userName);
	    }
	    @Override
	    @GetMapping("/getAllCarr")
	    @ResponseBody
	    public List<Career> getAllCareer(){
	        return careerRepository.findAll();
	    }
		


}
