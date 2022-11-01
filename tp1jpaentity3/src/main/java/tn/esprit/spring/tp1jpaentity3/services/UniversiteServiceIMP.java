package tn.esprit.spring.tp1jpaentity3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.entity.Universite;
import tn.esprit.spring.tp1jpaentity3.repositories.EtudiantRepository;
import tn.esprit.spring.tp1jpaentity3.repositories.UniversityRepository;
@Service
@Slf4j
public class UniversiteServiceIMP implements IUniversiteService {

    @Autowired
    UniversityRepository universityRepository;
    public Long ajouter_universite(Universite u){
        universityRepository.save(u);
        log.info("Ajouter universite");
        return u.getIdUniv();
    }
}
