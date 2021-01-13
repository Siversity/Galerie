package galerie.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import galerie.entity.Galerie;
import org.springframework.data.jpa.repository.Query;

// This will be AUTO IMPLEMENTED by Spring 

public interface GalerieRepository extends JpaRepository<Galerie, Integer> {
    
        @Query(
        value = 
        "SELECT SUM(prix_vente) AS chiffreAffaire "
                + "FROM Exposition "
                + "INNER JOIN Transaction ON Exposition.id = Transaction.lieu_de_vente_id "
                + "WHERE Transaction.lieu_de_vente_id = :idGalerie "
                + "AND Year(Transaction.vendu_le) = :annee",
        nativeQuery = true
    )
    float caAnnuel(Integer idGalerie, Integer annee);

}
