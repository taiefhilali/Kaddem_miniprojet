package tn.esprit.spring.tp1jpaentity3.entity;
import javax.persistence.*;
import java.io.Serializable;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Entity
@Table( name ="Etudiant")
@Getter
@Setter
@NoArgsConstructor
@Slf4j
@Data
public class Etudiant implements Serializable {
    @Enumerated Option opt ;
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @Column(name="idEtudiant")
    private Long idEtudiant; // Clé primaire
    private String prenomE;
    private String nomE;
    @ManyToOne
    private Departement dep;
    @OneToMany(mappedBy = "etudiant")
    private List <Contrat> contrats ;
    @ManyToMany(cascade = CascadeType.ALL)
    private List <Equipe> equipes;
// Constructeur et accesseurs (getters) et mutateurs (setters)




}