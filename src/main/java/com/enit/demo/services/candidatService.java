package com.enit.demo.services;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.enit.demo.entities.Candidat;


public interface candidatService {

   public void addCand(Candidat Candidat);

    public void removeCand(String userName);

    public void updateCand(Candidat Candidat);

    public Candidat findByCandidatCin(int candiddatCin);

    public List<Candidat> getAllCandidat();
    
   public void addPost();
    
    public void removePost(String id);
    
    public void findPost( String posId);
    
    public void findEntr(String id);
}
