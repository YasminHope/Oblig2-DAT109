package Test;
/**
 * Testklasse for Pris
 *
 * @author Ingelin Vikre
 */
import org.junit.jupiter.api.Test;
import org.oblig2.Pris;

import static org.junit.jupiter.api.Assertions.*;

public class PrisTest {

	// Test for å opprette faktura etter utleie. 
    @Test
    public void testOpprettFaktura() {
        Pris pris = new Pris(400, 200, 2);

        int antallDager = 5;
        int antallKilometer = 150;

        int forventetPris = (400 * 5) + (2 * 150) + 200;

        int beregnetPris = pris.opprettFaktura(antallDager, antallKilometer);
        assertEquals(forventetPris, beregnetPris, "Prisen som ble beregnet er feil!");
    }
    
}