package galerie.entity;
import java.time.LocalDate;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NonNull
    private LocalDate debut;
    
    private String intitule;
    
    private Integer duree;
    
    @ManyToOne
    @NonNull
    private Galerie organisateur;
    
    @ManyToMany
    private List<Tableau> oeuvres = new LinkedList<>();
    
    @OneToMany(mappedBy = "lieuDeVente")
    private List<Transaction> ventes = new LinkedList<>();
}
