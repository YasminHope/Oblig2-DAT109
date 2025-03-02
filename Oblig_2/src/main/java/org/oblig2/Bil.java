package org.oblig2;

import java.util.Date;

/**
 * Klasse for biler
 *
 * @author Yasmin Maria Hope
 */
public class Bil {
    private String regnr;
    private String merke;
    private String farge;
    private String utleiegruppe;
    private boolean tilgjengelighet;
    private Kontor kontor;
    private int kmstand;
    private Date datoUtleie;
    private Date datoRetur;

    public Bil(String regnr, String merke, String farge, String utleiegruppe, Kontor kontor) {
        this.regnr = regnr;
        this.merke = merke;
        this.farge = farge;
        this.utleiegruppe = utleiegruppe;
        tilgjengelighet = true;
        this.kontor = kontor;
        kmstand = 0;
    }

    public void oppdaterKmstand(int kmKjørt) {
        kmstand+=kmKjørt;
    }


    public String getRegnr() {
        return regnr;
    }

    public void setRegnr(String regnr) {
        this.regnr = regnr;
    }

    public String getMerke() {
        return merke;
    }

    public void setMerke(String merke) {
        this.merke = merke;
    }

    public String getFarge() {
        return farge;
    }

    public void setFarge(String farge) {
        this.farge = farge;
    }

    public String getUtleiegruppe() {
        return utleiegruppe;
    }

    public void setUtleiegruppe(String utleiegruppe) {
        this.utleiegruppe = utleiegruppe;
    }

    public boolean isTilgjengelig() {
        return tilgjengelighet;
    }

    public void setTilgjengelighet(boolean tilgjengelighet) {
        this.tilgjengelighet = tilgjengelighet;
    }

    public Kontor getKontor() {
        return kontor;
    }

    public int getKmstand() {
        return kmstand;
    }

    public void setKmstand(int kmstand) {
        this.kmstand = kmstand;
    }

    public void setKontor(Kontor kontor) {
        this.kontor = kontor;
    }
    public Date getDatoUtleie() {
        return datoUtleie;
    }

    public void setDatoUtleie(Date datoUtleie) {
        this.datoUtleie = datoUtleie;
    }

    public Date getDatoRetur() {
        return datoRetur;
    }

    public void setDatoRetur(Date datoRetur) {
        this.datoRetur = datoRetur;
    }
}
