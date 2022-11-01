package tn.esprit.spring.tp1jpaentity3.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;

import org.springframework.stereotype.Controller;
import tn.esprit.spring.tp1jpaentity3.repositories.EtudiantRepository;
import tn.esprit.spring.tp1jpaentity3.services.EtudiantServiceIMP;

import java.util.List;

@RestController
@RequestMapping("/EtudiantC")
public class EtudiantController {
    @Autowired
    EtudiantServiceIMP etudiantServiceIMP;
    EtudiantRepository etudiantRepository;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
   @GetMapping("/name")
    public ResponseEntity<List<Etudiant>> getEtudiantByName (@RequestParam String nomE){
        return new ResponseEntity <List<Etudiant>>(etudiantRepository.findBynomE(nomE), HttpStatus.OK);
    }
    @GetMapping("/depp")
    public ResponseEntity<List<Etudiant>> getEtudiantBydep (@RequestParam Departement dep){
        return new ResponseEntity <List<Etudiant>>(etudiantRepository.findBydep(dep), HttpStatus.OK);
    }

    @PostMapping("/addEtudiant")
    @ResponseBody
    public void addEtudiant(@RequestBody Etudiant etudiant){
        etudiantServiceIMP.ajouter_etudiant(etudiant);
    }

}
