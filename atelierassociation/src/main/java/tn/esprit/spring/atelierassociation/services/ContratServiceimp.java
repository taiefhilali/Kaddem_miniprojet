package tn.esprit.spring.atelierassociation.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.entity.Contrat;
import tn.esprit.spring.atelierassociation.repositeries.ContratRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class ContratServiceimp implements IContratService {
    @Autowired
    ContratRepository contratRepository;


    public Long Ajouter_contrat(Contrat contrat) {
        contratRepository.save(contrat);
        log.info("Ajouter contrat");
        return contrat.getIdContrat();
    }
    @Override
    public void removeContrat(Long idContrat) {
        contratRepository.deleteById(idContrat);

    }

    public List<Contrat> getAllContrats() {
        List<Contrat> contrats = new ArrayList<Contrat>();
        contratRepository.findAll().forEach(contrats1 -> contrats.add(contrats1));
        return contrats;
    }

    public Contrat getContratsById(int idContrat) {
        return contratRepository.findById((long) idContrat).get();

    }

    public void saveOrUpdate(Contrat contrats) {
        contratRepository.save(contrats);
    }

    public void updatecontrat(Contrat contrats, int idContrat)
    {
        contratRepository.save(contrats);
    }
}
