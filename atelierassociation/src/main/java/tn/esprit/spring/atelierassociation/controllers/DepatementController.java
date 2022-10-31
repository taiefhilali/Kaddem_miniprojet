package tn.esprit.spring.atelierassociation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.atelierassociation.entity.Departement;
import tn.esprit.spring.atelierassociation.entity.Etudiant;
import tn.esprit.spring.atelierassociation.repositeries.DepartementRepository;
import tn.esprit.spring.atelierassociation.services.DepartementServiceimp;
import tn.esprit.spring.atelierassociation.services.EtudiantServiceimp;

import java.util.List;

@RestController
@RequestMapping("/DepartementC")
public class DepatementController {

    @Autowired
    DepartementRepository departementRepository;
    DepartementServiceimp departmentServiceimp;
    //http://localhost:8088/Etudiant/add-Etudiant
    //{prenomE:"ali",nomE:"ali"}
    @GetMapping("/")
    public String Hello(){
        return "hello world";
    }

    @PostMapping("/addDepartement")
    @ResponseBody
    public void addDepartement(@RequestBody Departement departement){
        departmentServiceimp.Ajouter_department(departement);
    }

}
