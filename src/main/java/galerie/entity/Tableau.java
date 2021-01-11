package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity

public class Tableau {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(unique=true)
    @NonNull
    private String title;
    
    @Column(length=255)
    @NonNull
    private String support;
    
    @NonNull
    private Integer largeur;
    
    @NonNull
    private Integer hauteur;
    
    @ManyToOne
    private Artiste auteur;
    
    @ManyToMany(mappedBy = "oeuvres")
    private List<Exposition> accrochage = new LinkedList<>();
    
    @OneToOne(mappedBy = "oeuvre")
    private Transaction vendu;
    
}
