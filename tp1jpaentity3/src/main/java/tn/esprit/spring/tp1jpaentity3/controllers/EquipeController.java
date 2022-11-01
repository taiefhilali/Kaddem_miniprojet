package tn.esprit.spring.tp1jpaentity3.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.tp1jpaentity3.entity.Contrat;
import tn.esprit.spring.tp1jpaentity3.entity.Equipe;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.repositories.EquipeRepository;
import tn.esprit.spring.tp1jpaentity3.services.ContratServiceIMP;
import tn.esprit.spring.tp1jpaentity3.services.EquipeServiceIMP;

import java.util.List;

@RestController
@RequestMapping("/EquipeC")
public class EquipeController {

    @Autowired
    EquipeServiceIMP equipeServiceIMP;
    @Autowired
    EquipeRepository equipeRepository;

    @GetMapping("/nom")

    public ResponseEntity<List<Equipe>> getEquipesByNom(@RequestParam String nomEquipe){
        return new ResponseEntity <List<Equipe>>(equipeRepository.findByNomEquipe(nomEquipe), HttpStatus.OK);
    }
    @GetMapping("/id")

    public ResponseEntity<List<Equipe>> getEquipesById(@RequestParam Long idEquipe){
        return new ResponseEntity <List<Equipe>>(equipeRepository.findByIdEquipe(idEquipe), HttpStatus.OK);
    }
    @GetMapping("/equipes")

    public List<Equipe> retrieveAllEquipes(){
        return equipeRepository.findAll();
    }

    @PostMapping("/addEquipe")
    @ResponseBody
    public void addEquipe(@RequestBody Equipe equipe){

        equipeServiceIMP.ajouter_equipe(equipe);
    }


    @PutMapping("/equipe/{id}")
    @ResponseBody

    public void replaceEmployee(@RequestBody Equipe newEquipe, @PathVariable Long id) {

   
        equipeServiceIMP.modifier_equipe(newEquipe,id);

    }
}
