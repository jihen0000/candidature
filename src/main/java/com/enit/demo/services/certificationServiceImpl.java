package com.enit.demo.services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.enit.demo.dao.certificationRepository;
import com.enit.demo.entities.Certification;
import com.enit.demo.entities.Response;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.List;
@CrossOrigin(origins = "*")
@RestController
public class certificationServiceImpl implements certificationService{
    @Autowired
    public certificationRepository certificationRepository1;
    @Autowired
    public certificationService certificationsService;

    @Override
   
 
    @PostMapping(path="/addCert")
    public String addCert(@RequestBody Certification certification)
    {
       certificationRepository1.save(certification);
        return "certification added";}
    
    @Override
    @DeleteMapping("/removeCert/{cerName}")
    @ResponseBody
    public List<Certification> removeCert(@PathVariable("cerName") String cerName){
        System.out.println("In removeCert : ");
        certificationRepository1.deleteById(cerName);
        System.out.println("Out of removeCert : ");
        return certificationRepository1.findAll();
    }
    @Override
    @PutMapping("/updateCert")
    @ResponseBody
    public void updateCert(Certification Certification){
        
        certificationRepository1.save(Certification);
    }
    /*
    @Override
    @GetMapping("/findCert/{cerName}")
    @ResponseBody
    public Certification findCertByCerName(@PathVariable("cerName") String cerName){
        return certificationRepository1.findByCerName(cerName);
    }*/
    @Override
    @GetMapping("/getAllCert")
    @ResponseBody
    public List<Certification> getAllCertification(){
        return certificationRepository1.findAll();
    }
    
    
    
  
    /*
    @PostMapping(value="addCertNow")
    
    public ResponseEntity<Response> addCertNow(@RequestParam("file") MultipartFile file , @RequestParam("cert") String cert) throws JsonMappingException, JsonProcessingException{
    	 
    	Certification certification= new ObjectMapper().readValue(cert, Certification.class);
    	certification.setFilename(file.getOriginalFilename());
    	Certification dbCert=certificationRepository1.save(certification);
    	if (dbCert!= null){
    	return new ResponseEntity<Response>(new Response("Success"), HttpStatus.OK);
    	}
    	else {
    		return new ResponseEntity<Response>(new Response("non"), HttpStatus.BAD_REQUEST);
    	}
    	
    }*/
    
}
    
