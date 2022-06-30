package com.enit.demo.services;

import java.util.List;

import com.enit.demo.entities.Certification;

public interface certificationService {
    public String addCert(Certification certification);

    public List<Certification> removeCert(String cerName);

    public void updateCert(Certification Certification);

   // public Certification findCertByCerName(String cerName);

    public List<Certification> getAllCertification();
    public List <Certification> findCertByUsername(String userName);
}
