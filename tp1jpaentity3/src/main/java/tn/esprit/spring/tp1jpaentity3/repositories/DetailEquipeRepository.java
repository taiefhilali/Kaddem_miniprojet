package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tp1jpaentity3.entity.DetailEquipe;
import tn.esprit.spring.tp1jpaentity3.entity.Equipe;

public interface DetailEquipeRepository extends JpaRepository<DetailEquipe,Long> {
}
