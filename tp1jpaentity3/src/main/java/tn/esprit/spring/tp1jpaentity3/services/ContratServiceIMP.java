package tn.esprit.spring.tp1jpaentity3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1jpaentity3.entity.Contrat;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.repositories.ContratRepository;
import tn.esprit.spring.tp1jpaentity3.repositories.DepartementRepository;
@Service
@Slf4j
public class ContratServiceIMP implements IContratService {

    @Autowired
    ContratRepository contratRepository;

    public Long ajouter_contrat(Contrat c) {
        contratRepository.save(c);
        log.info("Ajouter departement");
        return c.getIdContrat();
    }
}
