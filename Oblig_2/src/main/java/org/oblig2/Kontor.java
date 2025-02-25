package org.oblig2;

public class Kontor {
    private int kontornummer;
    private String telefonnr;
    private Adresse adresse;

    public Kontor (int kontornummer, String telefonnr, Adresse adresse) {
        this.kontornummer = kontornummer;
        this.telefonnr = telefonnr;
        this.adresse = adresse;
    }

    public int getKontornummer() {
        return kontornummer;
    }

    public void setKontornummer(int kontornummer) {
        this.kontornummer = kontornummer;
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
