package org.oblig2;

/**
 * Klasse for kontorer
 *
 * @author Yasmin Maria Hope
 */
public class Kontor {
    private int kontornr;
    private String telefonnr;
    private Adresse adresse;

    public Kontor (int kontornr, String telefonnr, Adresse adresse) {
        this.kontornr = kontornr;
        this.telefonnr = telefonnr;
        this.adresse = adresse;
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
