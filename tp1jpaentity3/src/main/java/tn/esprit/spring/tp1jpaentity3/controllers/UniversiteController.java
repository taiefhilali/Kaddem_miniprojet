package tn.esprit.spring.tp1jpaentity3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Universite;
import tn.esprit.spring.tp1jpaentity3.services.DepartementServiceIMP;
import tn.esprit.spring.tp1jpaentity3.services.UniversiteServiceIMP;
@RestController
@RequestMapping("/UniversiteC")
public class UniversiteController {

    @Autowired
    UniversiteServiceIMP universiteServiceIMP;
    //http://localhost:8088/Departement/add-Dep
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/addUni")
    @ResponseBody
    public void addUni(@RequestBody Universite universite){
        universiteServiceIMP.ajouter_universite(universite);
    }

}
