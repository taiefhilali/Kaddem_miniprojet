package tn.esprit.spring.atelierassociation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.atelierassociation.entity.Contrat;
import tn.esprit.spring.atelierassociation.entity.Equipe;
import tn.esprit.spring.atelierassociation.services.ContratServiceimp;
import tn.esprit.spring.atelierassociation.services.EquipeServiceimp;

@RestController
@RequestMapping("/EquipeC")
public class EquipeController {


    @Autowired
    EquipeServiceimp equipeServiceimp;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/addEquipe")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe equipe){
        equipeServiceimp.Ajouter_equipe(equipe);
    }
}
