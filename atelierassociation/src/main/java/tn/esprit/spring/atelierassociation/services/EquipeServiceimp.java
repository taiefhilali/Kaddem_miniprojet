package tn.esprit.spring.atelierassociation.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.entity.Contrat;
import tn.esprit.spring.atelierassociation.entity.Equipe;
import tn.esprit.spring.atelierassociation.repositeries.ContratRepository;
import tn.esprit.spring.atelierassociation.repositeries.EquipeRepository;

@Service
@Slf4j
public class EquipeServiceimp  implements IEquipeService  {

    @Autowired
    EquipeRepository equipeRepository;


    public Long Ajouter_equipe(Equipe e) {
        equipeRepository.save(e);
        log.info("Ajouter equipe");
        return e.getIdEquipe();
    }
}
