package galerie.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
public class Transaction {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NonNull
    private Date venduLe;
    
    @NonNull
    private float prixVente;
    
    @ManyToOne
    private Exposition lieuDeVente;
    
    @OneToOne
    private Tableau oeuvre;
    
    @ManyToOne
    private Personne client;

}
