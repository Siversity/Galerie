package galerie.entity;

import java.util.Date;
import javax.persistence.*;
import lombok.*;

@Entity
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
public class Transaction {
    
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    
    @NonNull
    private Date venduLe;
    
    @NonNull
    private float prixVente;
    
    
    
}
