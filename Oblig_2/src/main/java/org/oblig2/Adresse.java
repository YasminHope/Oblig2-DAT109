package org.oblig2;

public class Adresse {
    private String gateadresse;
    private int postnr;
    private String poststed;

    public Adresse(String gateadresse, int postnr, String poststed) {
        this.gateadresse = gateadresse;
        this.postnr = postnr;
        this.poststed = poststed;
    }

    public String getGateadresse() {
        return gateadresse;
    }

    public void setGateadresse(String gateadresse) {
        this.gateadresse = gateadresse;
    }

    public int getPostnr() {
        return postnr;
    }

    public void setPostnr(int postnr) {
        this.postnr = postnr;
    }

    public String getPoststed() {
        return poststed;
    }

    public void setPoststed(String poststed) {
        this.poststed = poststed;
    }
}
