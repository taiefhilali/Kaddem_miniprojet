package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Equipe;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;
import tn.esprit.spring.tp1jpaentity3.entity.Universite;

import java.util.List;
@Repository

public interface EquipeRepository extends JpaRepository<Equipe,Long> {

   List<Equipe> findByNomEquipe(String nomEquipe);

   List<Equipe> findByIdEquipe(Long idEquipe);

   List<Equipe> findAll();


}
