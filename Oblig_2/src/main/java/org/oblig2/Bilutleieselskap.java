package org.oblig2;

import java.util.ArrayList;

/**
 * Klasse for selve bilutleieselskapet som holder på en liste med alle
 * kontorene som er opprettet for selskapet
 *
 * @author Yasmin Maria Hope
 */
public class Bilutleieselskap {
    private String navn;
    private String telefonnr;
    private Adresse adresse;
    private ArrayList<Kontor> kontorliste;

    public Bilutleieselskap(String navn, String telefonnr, Adresse adresse) {
        this.navn = navn;
        this.telefonnr = telefonnr;
        this.adresse = adresse;
        kontorliste = new ArrayList<Kontor>();
    }

    public void oppdaterKontorliste(Kontor kontor) {
        kontorliste.add(kontor);
    }

    public void listOppAlleKontorer(ArrayList<Kontor> kontorliste) {
        for (Kontor kontor: kontorliste) {
            kontor.toString();
        }
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
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
}
