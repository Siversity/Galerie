package galerie.entity;
import java.util.ArrayList;
import javax.persistence.*;
import lombok.*;

@ToString(callSuper = true) @NoArgsConstructor
@Entity

public class Artiste extends Personne {
    
    @Column(length=255)
    private String biographie;
    
    public Artiste(String nom, String adresse, String biographie) {
        super(nom, adresse);
        this.biographie = biographie;
    }
    
    @OneToMany
    private ArrayList<Tableau> listeTableaux;
}
