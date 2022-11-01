package tn.esprit.spring.tp1jpaentity3.entity;

import javax.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Entity
@Table( name ="Equipe")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Slf4j

public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idEquipe")
    private Long idEquipe; // Clé primaire
    private String nomEquipe;
    private Niveau niveau;
    @ManyToMany(mappedBy="equipes", cascade = CascadeType.ALL)

    private List<Etudiant> etudiants;
    @OneToOne
    private DetailEquipe detailEquipe;


}
