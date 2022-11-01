package tn.esprit.spring.tp1jpaentity3.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import tn.esprit.spring.tp1jpaentity3.entity.Departement;
import tn.esprit.spring.tp1jpaentity3.entity.Etudiant;

import java.util.List;

@Repository
public interface EtudiantRepository  extends JpaRepository<Etudiant,Long> {
    List<Etudiant> findBynomE(String nomE);
    @Override
    List<Etudiant> findAllById(Iterable<Long> longs);
    List<Etudiant> findBydep(Departement dep);
   /* @Query("SELECT e FROM Etudiant e ")



    @Query("SELECT Etudiant  FROM Etudiant etudiant"
            + " INNER JOIN etudiant.equipes equipe"
            + " INNER JOIN DetailEquipe detail"
            + " ON detail.idDetailEquipe = equipe.detailEquipe.idDetailEquipe"
    )


    @Modifying
    @Query("update Etudiant e set e.nomE = :nomE where e.nomE = :nomE")
            int updateEtudiant(@Param("nomE") String adresse,
            @Param("nomE")
            Long nomE);


    @Modifying
    @Query("DELETE FROM Etudiant e  where e.nomE = :nomE")
    int removeEtudiant(@Param("adresse") String adresse);




    List<Etudiant> retrieveAllEtudiants();

    Etudiant addEtudiant (Etudiant e);

    Etudiant updateEtudiant (Etudiant e);

    Etudiant retrieveEtudiant(Integer idEtudiant);

    void removeEtudiant(Integer idEtudiant);*/




}
