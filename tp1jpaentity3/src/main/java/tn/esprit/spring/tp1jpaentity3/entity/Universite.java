package tn.esprit.spring.tp1jpaentity3.entity;

import javax.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.List;
@Entity
@Table( name ="Universite")
@Getter
@Setter
@NoArgsConstructor
@Slf4j

public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idUniversite")
    private Long idUniv; // Clé primaire
    private String nomUniv;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Departement> Equipes;


}
