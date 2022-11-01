package tn.esprit.spring.tp1jpaentity3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.DetailEquipe;
import tn.esprit.spring.tp1jpaentity3.services.DepartementServiceIMP;
import tn.esprit.spring.tp1jpaentity3.services.DetailEquipeServiceIMP;

@RestController
@RequestMapping("/DetailEquipeC")
public class DetailEquipeController {
    @Autowired
    DetailEquipeServiceIMP detailequipeServiceIMP;

    //http://localhost:8088/Departement/add-Dep
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/adddetailequipe")
    @ResponseBody
    public void addDetailequipe(@RequestBody DetailEquipe de){
        detailequipeServiceIMP.ajouter_detail_equipe(de);
    }

}
