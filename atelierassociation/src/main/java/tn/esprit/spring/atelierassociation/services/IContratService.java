package tn.esprit.spring.atelierassociation.services;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.atelierassociation.entity.Contrat;

public interface IContratService {


    public  Long Ajouter_contrat(Contrat contrat );

    void removeContrat(Long idContrat);



}
