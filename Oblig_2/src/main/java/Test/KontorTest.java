package Test; 

/**
 * Testklasse for Kontor
 *
 * @author Ingelin Vikre
 */

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.oblig2.Adresse;
import org.oblig2.Bil;
import org.oblig2.Kontor;
import org.oblig2.Kunde;

public class KontorTest {
	
	private Kontor kontor;
    private Kunde kunde;
    private Bil bil;
    private Adresse adresse;

    @BeforeEach
    public void setUp() {
        // Opprette testdata
        adresse = new Adresse("Gateveien 1", 5000, "Bergen");
        kontor = new Kontor(101, "12345678", adresse);
        kunde = new Kunde("Ole", "Nordmann", adresse, "98765432");
        bil = new Bil("AB12345", "Toyota", "Rød", "SUV", kontor);
    }
    
	// Test for å opprette kunde
    @Test
    public void testOpprettKunde() {
        // Simuler brukerinput ved å bruke MockScanner
        MockScanner mockScanner = new MockScanner(
            "Erik", // Fornavn
            "Ål",  // Etternavn
            "Lars Hilles gate", // Gateadresse
            "12345", // Postnummer
            "Bergen", // Poststed
            "12345678" // Telefonnummer
        );
        
        Adresse adresse = new Adresse("Lars Hilles gate", 12345, "Bergen");
        Kontor kontor = new Kontor(102, "98765432", adresse);

        Kunde nyKunde = kontor.opprettKunde();

        // Sjekk at kunden er opprettet korrekt
        assertNotNull(nyKunde);
        assertEquals("Erik", nyKunde.getFornavn());
        assertEquals("Ål", nyKunde.getEtternavn());
        assertEquals("Lars Hilles gate", nyKunde.getAdresse().getGateadresse());
        assertEquals(12345, nyKunde.getAdresse().getPostnr());
        assertEquals("Bergen", nyKunde.getAdresse().getPoststed());
        assertEquals("12345678", nyKunde.getTelefonnr());
    }

    //Test for å opprette bil
    @Test
    public void testOpprettBil() {
        // Simuler brukerinput ved å bruke MockScanner
        MockScanner mockScanner = new MockScanner(
            "AB12345", // Regnr
            "Toyota",  // Merke
            "Rød",     // Farge
            "A", // Utleiegruppe
            "ja",      // Tilgjengelighet
            "102",     // Kontornr
            "99999999",// Kontortelefon
            "Lars Hilles gate", // Kontorgateadresse
            "54321", // Kontorpostnummer
            "Bergen" // Kontorpoststed
        );

        Adresse kontorAdresse = new Adresse("Lars Hilles gate", 54321, "Bergen");
        Kontor kontor = new Kontor(102, "99999999", kontorAdresse);

        Bil nyBil = kontor.opprettBil();

        // Sjekk at bilen er opprettet korrekt
        assertNotNull(nyBil);
        assertEquals("AB12345", nyBil.getRegnr());
        assertEquals("Toyota", nyBil.getMerke());
        assertEquals("Rød", nyBil.getFarge());
        assertEquals("A", nyBil.getUtleiegruppe());
        assertTrue(nyBil.isTilgjengelig());
        assertEquals(102, nyBil.getKontor().getKontornr());
        assertEquals("Lars Hilles gate", nyBil.getKontor().getAdresse().getGateadresse());
    }

    	//Tester utleie av bil 
        @Test
        public void testUtleieBil() {
    
            assertTrue(bil.isTilgjengelig(), "Bilen skal være tilgjengelig før utleie");

            Date datoUtleie = new Date(); 
            Date datoRetur = new Date(datoUtleie.getTime() + 86400000); 

            kontor.utleieBil(kunde, bil, "1234 5678 9012 3456", datoUtleie, datoRetur);

            assertFalse(bil.isTilgjengelig(), "Bilen skal ikke være tilgjengelig etter utleie");
            assertEquals("1234 5678 9012 3456", kunde.getKredittkortnr(), "Kredittkortnummeret skal være satt");
            assertNotNull(bil.getDatoUtleie(), "Dato for utleie skal ikke være null");
            assertNotNull(bil.getDatoRetur(), "Dato for retur skal ikke være null");
        }

        //Tester retur av bil
        @Test
        public void testReturBil() {
           
            Date datoUtleie = new Date(); 
            Date datoRetur = new Date(datoUtleie.getTime() + 86400000); 
            kontor.utleieBil(kunde, bil, "1234 5678 9012 3456", datoUtleie, datoRetur);

            assertFalse(bil.isTilgjengelig(), "Bilen skal ikke være tilgjengelig etter utleie");

            int kmKjørt = 100; 
            Date returDato = new Date(); 

            kontor.returBil(kunde, bil, kmKjørt, returDato);
            
            assertTrue(bil.isTilgjengelig(), "Bilen skal være tilgjengelig etter retur");
            assertEquals(kmKjørt, bil.getKmstand(), "Kilometerstanden skal være oppdatert");
            assertNotNull(bil.getDatoRetur(), "Dato for retur skal ikke være null");
        }
    }



