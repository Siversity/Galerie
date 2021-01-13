package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    
        @Query(
        value = 
        "SELECT SUM(Transaction.prix_vente) AS chiffreAffaire "
                + "FROM Transaction "
                + "INNER JOIN Exposition ON Transaction.lieu_de_vente_id = Exposition.id "
                + "WHERE Transaction.lieu_de_vente_id = :idExpo",
        nativeQuery = true
    )
    float chiffreAffairePour(Integer idExpo);
    
}
