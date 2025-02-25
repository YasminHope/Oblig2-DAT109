package org.oblig2;

import java.util.ArrayList;
import java.util.Date;

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
}
