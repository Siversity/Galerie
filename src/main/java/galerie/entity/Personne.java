package galerie.entity;
import javax.persistence.*;
import lombok.*;

@NoArgsConstructor @ToString
@Entity

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(length=255)
    private String nom;
    
    @Column(length=255)
    private String adresse;
    
    public Personne(String nom, String adresse) {
        this.nom = nom;
        this.adresse = adresse;
    }
}
