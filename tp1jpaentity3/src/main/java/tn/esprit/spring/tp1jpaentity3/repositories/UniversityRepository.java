package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import tn.esprit.spring.tp1jpaentity3.entity.Universite;

import java.util.List;

public interface UniversityRepository extends JpaRepository<Universite,Long> {
   /* @Query(value = "SELECT * FROM University e WHERE e.nomUniv = :nomUniv",
            nativeQuery = true)
    List<Universite> retrieveUniversityByNomUniv(@Param("nomUniv") String nomUniv);*/
}
