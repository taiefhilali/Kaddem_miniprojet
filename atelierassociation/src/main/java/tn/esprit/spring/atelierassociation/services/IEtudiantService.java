package tn.esprit.spring.atelierassociation.services;
import tn.esprit.spring.atelierassociation.entity.Etudiant;

public interface IEtudiantService {

    public  Long Ajouter_etudiant(Etudiant e );

    public void removeEtudiant(Long idEtudiant);

    Etudiant retrieveEtudiant(Long idEtudiant);
}
