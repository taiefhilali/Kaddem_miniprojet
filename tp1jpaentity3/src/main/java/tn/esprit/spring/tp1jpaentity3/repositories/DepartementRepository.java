package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Long> {
   /* @Query(value = "SELECT * FROM Departement  INNER JOIN Etudiant etudiant"
              , nativeQuery = true)


    List<Departement> retrieveEntreprisesBySpecialiteEquipe(@Param("idDepartement")
            String idDepartement);*/
}
