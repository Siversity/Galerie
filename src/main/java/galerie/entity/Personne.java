package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@NoArgsConstructor @ToString
@Entity

@DiscriminatorValue("P")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne {
    
    @Id @GeneratedValue(strategy  = GenerationType.IDENTITY)
    private Integer id;
    
    @NonNull
    private String nom;
    
    @NonNull
    private String adresse;
    
    public Personne(Integer id, String nom, String adresse) {
        this.id = id;
        this.nom = nom;
        this.adresse = adresse;
    }
    
    @OneToMany(mappedBy = "client")
    private List<Transaction> achats = new LinkedList<>();
}
