package tn.esprit.spring.tp1jpaentity3.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.repositories.EtudiantRepository;

@Service
@Slf4j
public class EtudiantServiceIMP implements IEtudiantService {

    @Autowired
    EtudiantRepository etudiantRepository;
    public Long ajouter_etudiant(Etudiant e){
        etudiantRepository.save(e);
        log.info("Ajouter Etudiant");
        return e.getIdEtudiant();
    }
}
