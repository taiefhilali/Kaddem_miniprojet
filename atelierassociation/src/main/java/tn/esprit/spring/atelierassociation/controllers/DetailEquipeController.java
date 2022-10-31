package tn.esprit.spring.atelierassociation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.atelierassociation.entity.Departement;
import tn.esprit.spring.atelierassociation.entity.DetailEquipe;
import tn.esprit.spring.atelierassociation.services.DepartementServiceimp;
import tn.esprit.spring.atelierassociation.services.DetailEquipeimp;

@RestController
@RequestMapping("/DetailEquipeC")
public class DetailEquipeController {

    @Autowired
    DetailEquipeimp detailEquipeimp;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/addDetailequipe")
    @ResponseBody
    public void addDetailEquipe(@RequestBody DetailEquipe detailEquipe){
        detailEquipeimp.Ajouter_detailequipe(detailEquipe);
    }
}
