package tn.esprit.spring.atelierassociation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.controllers.DetailEquipeController;
import tn.esprit.spring.atelierassociation.entity.Contrat;
import tn.esprit.spring.atelierassociation.entity.DetailEquipe;
import tn.esprit.spring.atelierassociation.repositeries.ContratRepository;
import tn.esprit.spring.atelierassociation.repositeries.DetailEquipeRepository;

@Service
@Slf4j
public class DetailEquipeimp implements IDetailEquipeService  {

    @Autowired
    DetailEquipeRepository detailEquipeRepository;

    @Override
    public Long Ajouter_detailequipe(DetailEquipe de) {
        detailEquipeRepository.save(de);
        log.info("Ajouter contrat");
        return de.getIdDeatilEquipe();    }
}
