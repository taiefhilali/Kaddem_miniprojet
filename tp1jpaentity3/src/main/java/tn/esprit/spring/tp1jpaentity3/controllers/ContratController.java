package tn.esprit.spring.tp1jpaentity3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Contrat;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.services.ContratServiceIMP;
import tn.esprit.spring.tp1jpaentity3.services.DepartementServiceIMP;

@RestController
@RequestMapping("/ContratC")
public class ContratController {
    @Autowired
    ContratServiceIMP contratServiceIMP;
    //http://localhost:8088/Departement/add-Dep
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/addContrat")
    @ResponseBody
    public void addContrat(@RequestBody Contrat contrat){
        contratServiceIMP.ajouter_contrat(contrat);
    }

}
