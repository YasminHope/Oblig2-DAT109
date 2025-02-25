package org.oblig2;

import java.util.ArrayList;

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

    public void LeiUtBil(Kunde kunde, Bil bil, String kredittkortnr, int kmKjørt) {
        kunde.setKredittkortnr(kredittkortnr);
        bil.setKmstand(bil.getKmstand() + kmKjørt);
    }

    public void taImotBil(Bil bil) {
        bil.
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

    @Override
    public String toString() {
        return "Kontor{" +
                "kontornummer=" + kontornr +
                ", telefonnr='" + telefonnr + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}
