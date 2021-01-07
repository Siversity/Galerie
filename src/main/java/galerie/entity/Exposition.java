package galerie.entity;
import java.util.ArrayList;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @NonNull
    private Date debut;
    
    private String intitule;
    
    private Integer duree;
    
    @ManyToOne
    @NonNull
    private Galerie galerie;
    
    @ManyToMany
    private ArrayList<Tableau> listeTableaux = new ArrayList<>();
}
