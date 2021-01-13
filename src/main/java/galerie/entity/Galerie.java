package galerie.entity;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import javax.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Galerie {
    
    @Id
    private Integer id;

    @NonNull
    private String nom;
    
    @NonNull
    private String adresse;
    
    // TODO : Mettre en oeuvre la relation oneToMany vers Exposition
    @OneToMany(mappedBy = "organisateur")
    private List<Exposition> evenements = new LinkedList<>();
    
    public float CAannuel(int date) {
        float ca = 0;
        for (Exposition e : evenements) {
            if(e.getDebut().getYear() == date) {
                List<Transaction> lesVentes = e.getVentes();
                for (Transaction t : lesVentes) {
                    if(t.getVenduLe().getYear() == date) {
                        ca = ca + t.getPrixVente();
                    }
                }
            }
        }
        return ca;
    }
}
