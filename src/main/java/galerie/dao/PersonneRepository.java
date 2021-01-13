package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Personne;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 

public interface PersonneRepository extends JpaRepository<Personne, Integer>{
    
        @Query(
        value = 
        "SELECT SUM(prix_vente) AS budgetArt "
                + "FROM Transaction "
                + "WHERE client_id = :idClient "
                + "AND YEAR(vendu_le) = :annee",
        nativeQuery = true
    )
    float budgetArt(Integer idClient, Integer annee);
    
}
