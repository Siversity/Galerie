package galerie.entity;
import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity
public class Exposition {
    
    @Id
    private Date debut;
    
    private String intitule;
    
    private Integer duree;
    
    @ManyToOne
    @NonNull
    private Galerie galerie;
}
