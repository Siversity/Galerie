package galerie.dao;

import galerie.entity.Galerie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.test.context.jdbc.Sql;
import galerie.dao.PersonneRepository;

@Log4j2 // Génère le 'logger' pour afficher les messages de trace
@DataJpaTest
public class PersonneRepositoryTest {
    
    @Autowired
    private PersonneRepository personneDAO;
    
    @Test
    @Sql("test-data.sql")
    public void budgetArtTest() {
        float budgetAttendu = 1;
        float budgetCalcule = personneDAO.budgetArt(45, 2000);
        assertEquals(budgetAttendu, budgetCalcule);
    }
    
}
