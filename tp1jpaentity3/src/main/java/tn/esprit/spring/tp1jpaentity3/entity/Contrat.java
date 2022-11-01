package tn.esprit.spring.tp1jpaentity3.entity;
import javax.persistence.*;
import java.util.Date;
import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Entity
@Table( name ="Contrat")
@Getter
@Setter
@NoArgsConstructor
@ToString
@Slf4j

public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idContrat")
    private Long idContrat; // Clé primaire
    private Date dateDebutContrat;
    private Date dateFinContrat;
    private Specialite specialite ;
    private Boolean archive;
    private Long montantContrat ;
    @ManyToOne
    private Etudiant etudiant;


}
