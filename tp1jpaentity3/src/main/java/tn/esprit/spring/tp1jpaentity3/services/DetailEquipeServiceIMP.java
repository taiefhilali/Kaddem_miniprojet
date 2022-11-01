package tn.esprit.spring.tp1jpaentity3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.tp1jpaentity3.entity.DetailEquipe;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.repositories.DetailEquipeRepository;
import tn.esprit.spring.tp1jpaentity3.repositories.EtudiantRepository;
@Service
@Slf4j
public class DetailEquipeServiceIMP implements IDetailEquipeService {


    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    public Long ajouter_detail_equipe(DetailEquipe de){
        detailEquipeRepository.save(de);
        log.info("Ajouter detail equipe");
        return de.getIdDetailEquipe();
    }
}
