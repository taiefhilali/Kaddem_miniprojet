package tn.esprit.spring.tp1jpaentity3.entity;

import javax.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Table( name ="Departement")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Slf4j

public class Departement {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idDepartement")
    private Long idDepartement; // Clé primaire
    private String nomDepartement;
    @OneToMany(mappedBy = "dep")
    private List <Etudiant> etudiants;


}
