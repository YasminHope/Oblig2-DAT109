package org.oblig2;

import java.util.ArrayList;
import java.util.Date;

/**
 * Klasse for kunder
 *
 * @author Yasmin Maria Hope
 */
public class Kunde {
    private String fornavn;
    private String etternavn;
    private Adresse adresse;
    private String telefonnr;
    private String kredittkortnr;

    public Kunde(String fornavn, String etternavn, Adresse adresse, String telefonnr) {
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public ArrayList<Bil> søkOppBil(Kontor kontor, Date datoForUtleie, int antallDager) {
        ArrayList<Bil> søkteBiler = new ArrayList<Bil>();
        for (Bil bil: kontor.getBilliste()) {
            if (bil.isTilgjengelig()) {
                søkteBiler.add(bil);
            }
        }
        return søkteBiler;
    }

    public String getFornavn() {
        return fornavn;
    }

    public void setFornavn(String fornavn) {
        this.fornavn = fornavn;
    }

    public String getEtternavn() {
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public Adresse getAdresse() {
        return adresse;
    }

    public void setAdresse(Adresse adresse) {
        this.adresse = adresse;
    }

    public String getTelefonnr() {
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr) {
        this.telefonnr = telefonnr;
    }

    public String getKredittkortnr() {
        return kredittkortnr;
    }

    public void setKredittkortnr(String kredittkortnr) {
        this.kredittkortnr = kredittkortnr;
    }
}
