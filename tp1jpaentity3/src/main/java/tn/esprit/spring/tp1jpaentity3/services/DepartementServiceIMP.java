package tn.esprit.spring.tp1jpaentity3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.repositories.DepartementRepository;
@Service
@Slf4j
public class DepartementServiceIMP implements IDepartementService {

    @Autowired
    DepartementRepository departementRepository;

    public Long ajouter_dep(Departement d) {
        departementRepository.save(d);
        log.info("Ajouter departement");
        return d.getIdDepartement();
    }
}
