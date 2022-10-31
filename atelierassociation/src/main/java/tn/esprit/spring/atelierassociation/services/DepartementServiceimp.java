package tn.esprit.spring.atelierassociation.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.atelierassociation.entity.Departement;
import tn.esprit.spring.atelierassociation.repositeries.DepartementRepository;


@Service
@Slf4j
public class DepartementServiceimp  implements IDepartementService{
    @Autowired
    DepartementRepository departementRepository;


    public Long Ajouter_department(Departement d) {
        departementRepository.save(d);
        log.info("Ajouter department");
        return d.getIdDepart();
    }
}
