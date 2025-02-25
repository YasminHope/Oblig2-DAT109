 package Test; 

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.oblig2.Adresse;
import org.oblig2.Bil;
import org.oblig2.Kontor;
import org.oblig2.Kunde;

public class KontorTest {

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

        // Opprett kontorobjekt
        Adresse adresse = new Adresse("Lars Hilles gate", 12345, "Bergen");
        Kontor kontor = new Kontor(101, "98765432", adresse);

        // Kall opprettKunde med MockScanner
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

        // Opprett kontorobjekt
        Adresse kontorAdresse = new Adresse("Lars Hilles gate", 54321, "Bergen");
        Kontor kontor = new Kontor(102, "99999999", kontorAdresse);

        // Kall opprettBil med MockScanner
        Bil nyBil = kontor.opprettBil();

        // Sjekk at bilen er opprettet korrekt
        assertNotNull(nyBil);
        assertEquals("AB12345", nyBil.getRegnr());
        assertEquals("Toyota", nyBil.getMerke());
        assertEquals("Rør", nyBil.getFarge());
        assertEquals("A", nyBil.getUtleiegruppe());
        assertTrue(nyBil.isTilgjengelig());
        assertEquals(102, nyBil.getKontor().getKontornr());
        assertEquals("Lars Hilles gate", nyBil.getKontor().getAdresse().getGateadresse());
    }
}


