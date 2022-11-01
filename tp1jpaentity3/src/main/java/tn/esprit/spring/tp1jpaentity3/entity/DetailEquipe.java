package tn.esprit.spring.tp1jpaentity3.entity;

import javax.persistence.*;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table( name ="DetailEquipe")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Slf4j

public class DetailEquipe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idDetailEquipe")
    private Long idDetailEquipe; // Clé primaire
    private Long salle;
    private String thematique;
    @OneToOne(mappedBy="detailEquipe")
    private Equipe equipe;



}
