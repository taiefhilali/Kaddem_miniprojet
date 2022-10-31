package tn.esprit.spring.atelierassociation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.atelierassociation.entity.Contrat;
import tn.esprit.spring.atelierassociation.entity.Departement;
import tn.esprit.spring.atelierassociation.entity.Etudiant;
import tn.esprit.spring.atelierassociation.services.ContratServiceimp;
import tn.esprit.spring.atelierassociation.services.DepartementServiceimp;

import java.util.List;

@RestController
@RequestMapping("/ContratC")
public class ContratController {

    @Autowired
    ContratServiceimp contratServiceimp;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/allcontrat")
    private List<Contrat> getAllContrats()
    {
        return contratServiceimp.getAllContrats();
    }
    @GetMapping("/allcontrat/{idContrat}")
    private Contrat getBooks(@PathVariable("idContrat") int idContrat)
    {
        return contratServiceimp.getContratsById(idContrat);
    }
    @PostMapping("/addContrat")
    @ResponseBody
    public void addContrat(@RequestBody Contrat contrat){
        contratServiceimp.Ajouter_contrat(contrat);
    }
    @DeleteMapping ("/removeContrat/{idContrat}")
    @ResponseBody
    public void removecontrat(@PathVariable("idContrat") Long idContrat) {
        contratServiceimp.removeContrat(idContrat);

    }
    @PostMapping("/contrats")
    private int saveContrat(@RequestBody Contrat contrats)
    {
        contratServiceimp.saveOrUpdate(contrats);
        return Math.toIntExact(contrats.getIdContrat());
    }
    @PutMapping("/UpdateContrat")
    private Contrat updatecontrat(@RequestBody Contrat contrats)
    {
        contratServiceimp.saveOrUpdate(contrats);
        return contrats;
    }
}
