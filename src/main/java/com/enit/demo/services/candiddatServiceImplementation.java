package com.enit.demo.services;
import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.enit.demo.dao.CareerRepository;
import com.enit.demo.dao.SkillRepository;
import com.enit.demo.dao.candidatRepository;
import com.enit.demo.dao.certificationRepository;
import com.enit.demo.entities.Candidat;
import com.enit.demo.entities.Career;
import com.enit.demo.entities.Certification;
import com.enit.demo.entities.Skill;

import java.util.List;
import java.util.Optional;
@CrossOrigin(origins = "*")
@RestController
public class candiddatServiceImplementation implements candidatService{
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	public candidatRepository candidatRepository;
	@Autowired 
	CareerRepository careerRepository;
	@Autowired 
	SkillRepository skillRepository;
	@Autowired 
	certificationRepository certificationRepository1;
	
	public CareerService careerService;

    @Override
    @PostMapping(path="/addCandidat")
    public void addCand(Candidat Candidat) {
        System.out.println("In addCand : ");
        candidatRepository.insert(Candidat);
        System.out.println("Out of addCand : ");
    }

    @Override
    @DeleteMapping(path="/removeCandidat/{userName}")
    public void removeCand(@PathVariable("userName") String id) {
        System.out.println("In removeColl : ");
        candidatRepository.deleteById(id);
        System.out.println("Out of removeColl : ");
    }

    @Override
    @PutMapping(path="/updateCandidat")
    public void updateCand(Candidat Candidat) {
    	System.out.println("In updateColl : ");
        candidatRepository.save(Candidat);
        System.out.println("Out of updateColl : ");
        
    }

    @Override
    @GetMapping(path="/getAllCandidat")
    public List<Candidat> getAllCandidat() {
    	System.out.println("IN GET ALL CANDIDATS");
        return candidatRepository.findAll();
    }

	@Override
	@GetMapping(path="/findCandidat/{candidatCin}")
	public Candidat findByCandidatCin(@PathVariable("candidatCin") int candidatCin) {
		
		return candidatRepository.findByCandidatCin(candidatCin);
	}
	/*
	@Override
	@PostMapping(path="/addPost")
	@ResponseBody
	public void addPost() {
		
		System.out.println("IN ADD POST");
		RestTemplate restTemplate = new RestTemplate();
		String response= restTemplate.getForObject("http://localhost:8081/addPost",String.class);
		System.out.println("OUT OF ADD POST");
	}
    @Override
    @DeleteMapping(path="/removePost12/{posId}")
    @ResponseBody
    public void removePost(@PathVariable("posId") String id) {
    	System.out.println("IN DELETE POST");
        RestTemplate restTemplate = new RestTemplate();
        String reponse= restTemplate.getForObject("http://localhost:8081/removePostuler/"+id,String.class);
        System.out.println("OUT OF DELETE POST");
    
   }*/

    @Override
    @GetMapping("/findPost12/{posId}")
    @ResponseBody
    public void findPost(@PathVariable("posId") String id){
    	System.out.println("IN FIND POST");
    	RestTemplate restTemplate = new RestTemplate();
        String reponse= restTemplate.getForObject("http://localhost:8081/findPostuler/"+id,String.class);
        System.out.println("OUT OF FIND POST");   
        }
    @Override
    @GetMapping("/findEntr/{entretienId}")
    @ResponseBody
    public void findEntr(@PathVariable("entretienId") String id){
    	System.out.println("IN FIND ENTRETIEN");
    	RestTemplate restTemplate = new RestTemplate();
        String reponse= restTemplate.getForObject("http://localhost:8082/findEntretien/"+id,String.class);
        System.out.println("OUT OF FIND ENTRETIEN");   
        }
    
    
    
    
    
    @GetMapping("/careers/{username}")
    @ResponseBody
    public List<Career> getAllCareer(@PathVariable("username") String username)
    {
        System.out.println("listerddddd");
        return  careerRepository.findCarByuserName(username);
    }
    
    @GetMapping("/skills/{userName}")
    @ResponseBody
    public List<Skill> getAllSkills(@PathVariable("userName") String userName)
    {
        System.out.println("listerddddd");
        return  skillRepository.findByUserName(userName);
    }
    
    
    @GetMapping("/Certs/{userName}")
    @ResponseBody
    public List<Certification> getAllCertification(@PathVariable("userName") String userName)
    {
        System.out.println("listerddddd");
        return certificationRepository1.findByUserName(userName);
    }
    
}
