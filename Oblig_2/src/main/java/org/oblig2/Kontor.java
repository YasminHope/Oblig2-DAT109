package org.oblig2;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 * Klasse for kontorer
 *
 * @author Yasmin Maria Hope
 */
public class Kontor {
    private int kontornr;
    private String telefonnr;
    private Adresse adresse;
    private ArrayList<Bil> billiste;

    public Kontor (int kontornr, String telefonnr, Adresse adresse) {
        this.kontornr = kontornr;
        this.telefonnr = telefonnr;
        this.adresse = adresse;
        billiste = new ArrayList<Bil>();
    }

    public void reserverBil(Bil bil) {
        bil.setTilgjengelighet(false);
    }

    public void leiUtBil(Kunde kunde, Bil bil, String kredittkortnr, Date datoUtleie, Date datoRetur) {
        kunde.setKredittkortnr(kredittkortnr);
        bil.getRegnr();
        bil.getKmstand();

    }

    public void returBil(Bil bil, int kmKjørt, Date datoRetur) {
        bil.setTilgjengelighet(true);
        bil.oppdaterKmstand(kmKjørt);
    }

    public int getKontornr() {
        return kontornr;
    }

    public void setKontornr(int kontornr) {
        this.kontornr = kontornr;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public ArrayList<Bil> getBilliste() {
        return billiste;
    }

    public void setBilliste(ArrayList<Bil> billiste) {
        this.billiste = billiste;
    }

    @Override
    public String toString() {
        return "Kontor{" +
                "kontornummer=" + kontornr +
                ", telefonnr='" + telefonnr + '\'' +
                ", adresse=" + adresse +
                '}';
    }
    /**
    * Oppretter en ny kunde ved å be om informasjon fra brukeren.
    * 
    * @return Et nytt Kunde-objekt basert på brukerens input.
    * @author Ingelin Vikre
    */
        public Kunde opprettKunde() {
        	Scanner scanner = new Scanner(System.in);

            // Personlig informasjon
            System.out.print("Skriv inn kundens fornavn: ");
            String fornavn = scanner.nextLine();

            System.out.print("Skriv inn kundens etternavn: ");
            String etternavn = scanner.nextLine();

            // Adresseinformasjon
            System.out.print("Skriv inn kundens gateadresse: ");
            String gateadresse = scanner.nextLine();

            System.out.print("Skriv inn kundens postnummer: ");
            int postnr = Integer.parseInt(scanner.nextLine());

            System.out.print("Skriv inn kundens poststed: ");
            String poststed = scanner.nextLine();

            System.out.print("Skriv inn kundens telefonnummer: ");
            String telefonnr = scanner.nextLine();

            // Opprett adresse- og kundeobjekter
            Adresse adresse = new Adresse(gateadresse, postnr, poststed);
            Kunde nyKunde = new Kunde(fornavn, etternavn, adresse, telefonnr);

            System.out.println("Ny kunde opprettet: " + fornavn + " " + etternavn);
            return nyKunde;
        }

    /**
    * Oppretter en ny bil ved å be om informasjon fra brukeren.
    * 
    * @return Et nytt Bil-objekt basert på brukerens input.
    */
        public Bil opprettBil() {
        	Scanner scanner = new Scanner(System.in);

            // Informasjon til bil
            System.out.print("Skriv inn bilens regnr: ");
            String regnr = scanner.nextLine();

            System.out.print("Skriv inn bilens merke: ");
            String merke = scanner.nextLine();

            System.out.print("Skriv inn bilens farge: ");
            String farge = scanner.nextLine();

            System.out.print("Skriv inn bilens utleiegruppe: ");
            String utleiegruppe = scanner.nextLine();

            System.out.print("Er bilen tilgjengelig?: ");
            String tilgjengeligInput = scanner.nextLine();
            boolean tilgjengelighet = tilgjengeligInput.equalsIgnoreCase("ja");

            // Informasjon til kontor
            System.out.print("Skriv inn kontorets kontornr: ");
            int kontornr = Integer.parseInt(scanner.nextLine());

            System.out.print("Skriv inn kontorets telefonnr: ");
            String telefonnr = scanner.nextLine();

            // Adresseinformasjon
            System.out.print("Skriv inn kontorets gateadresse: ");
            String gateadresse = scanner.nextLine();

            System.out.print("Skriv inn kontorets postnummer: ");
            int postnr = Integer.parseInt(scanner.nextLine());

            System.out.print("Skriv inn kontorets poststed: ");
            String poststed = scanner.nextLine();

            // Opprett adresse- og kontorobjekter
            Adresse adresse = new Adresse(gateadresse, postnr, poststed);
            Kontor kontor = new Kontor(kontornr, telefonnr, adresse);

            // Opprett bilobjekt
            Bil nyBil = new Bil(regnr, merke, farge, utleiegruppe, kontor);
            nyBil.setTilgjengelighet(tilgjengelighet);

            System.out.println("Ny bil opprettet: " + regnr);
            return nyBil;
            }
        }

