package tn.esprit.spring.atelierassociation.repositeries;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.atelierassociation.entity.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}
