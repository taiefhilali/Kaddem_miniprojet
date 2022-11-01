package tn.esprit.spring.tp1jpaentity3.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.services.DepartementServiceIMP;
import tn.esprit.spring.tp1jpaentity3.services.EtudiantServiceIMP;

@RestController
@RequestMapping("/DepartementC")
public class DepartementController {
    @Autowired
    DepartementServiceIMP departementServiceIMP;
    //http://localhost:8088/Departement/add-Dep
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }
    @PostMapping("/addDep")
    @ResponseBody
    public void addDep(@RequestBody Departement departement){
        departementServiceIMP.ajouter_dep(departement);
    }

}
