package Test;
/**
 * Testklsse for KontorService
 *
 * @author Ingelin Vikre
 */
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.oblig2.Adresse;
import org.oblig2.Kontor;

public class KontorServiceTest {

    @Test
    public void testOpprettNyttKontor() {
    	 
        // Oppretter en Adresse- og Kontor-objekt 
        Adresse adresse = new Adresse("Gateveien 1", 5000, "Bergen");
        Kontor kontor = new Kontor(101, "12345678", adresse); 

        assertEquals(101, kontor.getKontornr());
        assertEquals("12345678", kontor.getTelefonnr());
        assertEquals("Gateveien 1", kontor.getAdresse().getGateadresse());
        assertEquals(5000, kontor.getAdresse().getPostnr());
        assertEquals("Bergen", kontor.getAdresse().getPoststed());
    }
}

