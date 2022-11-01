package tn.esprit.spring.tp1jpaentity3.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import tn.esprit.spring.tp1jpaentity3.entity.Equipe;
import tn.esprit.spring.tp1jpaentity3.repositories.EquipeRepository;

import java.util.ArrayList;
import java.util.List;

@Service
@Slf4j
public class EquipeServiceIMP implements IEquipeService {
    @Autowired
    EquipeRepository equipeRepository;


    public Long ajouter_equipe(Equipe eq){
        equipeRepository.save(eq);
        log.info("Ajouter  equipe");
        return eq.getIdEquipe();
    }

    public Long modifier_equipe ( Equipe newEquipe,  Long id)
    {

        return equipeRepository.findById(id)
                .map(equipe -> {
                    equipe.setNomEquipe(newEquipe.getNomEquipe());
                    equipe.setNiveau(newEquipe.getNiveau());
                    return equipeRepository.save(equipe);
                })
                .orElseGet(() -> {
                    newEquipe.setIdEquipe(id);
                    return equipeRepository.save(newEquipe);
                }).getIdEquipe();
    }
}
