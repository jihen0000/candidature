package com.enit.demo.services;

import java.util.List;
import java.util.Optional;

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

import com.enit.demo.dao.SkillRepository;
import com.enit.demo.entities.Career;
import com.enit.demo.entities.Skill;

@CrossOrigin(origins = "*")
@RestController
public class SkillServiceImpl implements SkillService {

	
	@Autowired
   
	public SkillRepository skillRepository;

    @Override
    @PostMapping("/addComp")
     public String addComp(@RequestBody Skill skill)
    {
       skillRepository.save(skill);
        return "skill added";
    }
    @Override@DeleteMapping("/removeComp/{comId}")
    @ResponseBody
    public List<Skill> removeComp(@PathVariable("comId") String username){
        System.out.println("In removeomp : ");
       skillRepository.deleteById(username);
        System.out.println("Out of removeComp : ");
        return skillRepository.findAll();
    }
    @Override
    @PutMapping("/updateComp")
    @ResponseBody
    public void updateComp(Skill skill){
        
        skillRepository.save(skill);
    }
    @Override
    @GetMapping("/findComp/{userName}")
    @ResponseBody
    public List<Skill> findByusername(@PathVariable("userName") String userName){
        return skillRepository.findByUserName(userName);
    }
   
    @Override
    @GetMapping("/getAllComp")
    @ResponseBody
    public List<Skill> getAllSkills(){
        return skillRepository.findAll();
    }
}
