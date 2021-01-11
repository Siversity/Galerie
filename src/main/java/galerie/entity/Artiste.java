package galerie.entity;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

@ToString(callSuper = true) @NoArgsConstructor
@Entity

public class Artiste extends Personne {
    
    @Column(length=255)
    private String biographie;
    
    public Artiste(int idPersonne, String nom, String adresse, String biographie) {
        super(idPersonne, nom, adresse);
        this.biographie = biographie;
    }
    
    @OneToMany(mappedBy = "auteur")
    private List<Tableau> oeuvres = new LinkedList<>();
}
