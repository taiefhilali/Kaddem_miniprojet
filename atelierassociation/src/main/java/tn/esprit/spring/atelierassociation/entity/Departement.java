package tn.esprit.spring.atelierassociation.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table( name="Departement")
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class Departement implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idDepart")
    private Long idDepart; // ClÃ© primaire
    private String nomDepart;

   // @OneToMany(mappedBy = "dept")
    @ManyToOne
   private Etudiant etuds;



}
