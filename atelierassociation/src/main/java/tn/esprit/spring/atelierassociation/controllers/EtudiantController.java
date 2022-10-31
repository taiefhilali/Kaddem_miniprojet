package tn.esprit.spring.atelierassociation.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.atelierassociation.entity.Etudiant;

import org.springframework.stereotype.Controller;
import tn.esprit.spring.atelierassociation.repositeries.EquipeRepository;
import tn.esprit.spring.atelierassociation.repositeries.EtudiantRepository;
import tn.esprit.spring.atelierassociation.services.EtudiantServiceimp;

import java.util.List;

@RestController
@RequestMapping("/EtudiantC")
public class EtudiantController {
    @Autowired
    EtudiantServiceimp etudiantServiceimp;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/retrieve-etudiant/{idEtudiant}")
    @ResponseBody
    public Etudiant retrieveEtudiant(@PathVariable("idEtudiant") Long idEtudiant) {
            return etudiantServiceimp.retrieveEtudiant(idEtudiant);
}
    @PostMapping("/addEtudiant")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant){
        etudiantServiceimp.Ajouter_etudiant(etudiant);
    }
    @DeleteMapping("/removeEtudiant/{idEtudiant}")
    @ResponseBody
    public void removeEtudiant(@PathVariable("idEtudiant") Long idEtudiant) {
        etudiantServiceimp.removeEtudiant(idEtudiant);




}}