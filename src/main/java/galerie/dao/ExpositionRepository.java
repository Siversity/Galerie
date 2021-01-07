package galerie.dao;

import galerie.entity.Exposition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 

public interface ExpositionRepository extends JpaRepository<Exposition, Integer> {
    
        @Query(
        value = 
        "SELECT COUNT(prixVente) AS chiffreAffaire"
                + "FROM Exposition"
                + "INNER JOIN Tableau ON Exposition_id = id"
                + "WHERE id = :idExpo",
        nativeQuery = true
    )
    float chiffreAffairePour(Integer idExpo);
    
}
