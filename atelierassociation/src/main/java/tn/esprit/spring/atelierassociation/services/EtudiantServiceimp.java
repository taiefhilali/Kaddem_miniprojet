package tn.esprit.spring.atelierassociation.services;



import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.entity.Etudiant;
import tn.esprit.spring.atelierassociation.repositeries.EtudiantRepository;

import java.util.List;

@Service
@Slf4j
public class EtudiantServiceimp implements IEtudiantService{


    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public Long Ajouter_etudiant(Etudiant e) {
        etudiantRepository.save(e);
        log.info("Ajouter Etudiant");
        return e.getIdEtudiant();
    }

    @Override
    public void removeEtudiant(Long idEtudiant) {
        etudiantRepository.deleteById(idEtudiant);

    }

    @Override
    public Etudiant retrieveEtudiant(Long idEtudiant) {
        etudiantRepository.findById(idEtudiant);
      return null;
    }


}