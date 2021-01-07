package galerie.entity;
import java.util.ArrayList;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Tableau {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String title;
    
    @Column(length=255)
    @NonNull
    private String support;
    
    @NonNull
    private Integer largeur;
    
    @NonNull
    private Integer hauteur;
    
    @ManyToOne
    private Artiste artiste;
    
    @ManyToMany
    private ArrayList<Exposition> participationExpos = new ArrayList<>();
    
}
