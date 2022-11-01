package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.tp1jpaentity3.entity.Contrat;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
