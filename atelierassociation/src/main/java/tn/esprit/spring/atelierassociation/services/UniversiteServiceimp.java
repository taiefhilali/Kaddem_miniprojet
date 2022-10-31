package tn.esprit.spring.atelierassociation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.entity.Universite;
import tn.esprit.spring.atelierassociation.repositeries.EquipeRepository;
import tn.esprit.spring.atelierassociation.repositeries.UniversiteRepository;

@Service
@Slf4j
public class UniversiteServiceimp implements IUniversiteService {


    @Autowired
    UniversiteRepository universiteRepository;
    @Override
    public Long Ajouter_universite(Universite u) {
        universiteRepository.save(u);
        log.info("Ajouter universite");
        return u.getIdUniv();
    }
}
