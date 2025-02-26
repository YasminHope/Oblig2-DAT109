package org.oblig2;

public class Pris {

	private int dagsPris = 400; 
	private int returGebyr =200; 
	private int kmPris = 2;
	
	public Pris(int dagsPris, int returGebyr, int kmPris) {
		super();
		this.dagsPris = dagsPris;
		this.returGebyr = returGebyr;
		this.kmPris = kmPris;
	}

	public int getDagsPris() {
		return dagsPris;
	}

	public void setDagsPris(int dagsPris) {
		this.dagsPris = dagsPris;
	}

	public int getReturGebyr() {
		return returGebyr;
	}

	public void setReturGebyr(int returGebyr) {
		this.returGebyr = returGebyr;
	}

	public int getKmPris() {
		return kmPris;
	}

	public void setKmPris(int kmPris) {
		this.kmPris = kmPris;
	} 
	
    // Faktura for utleie 
    public int opprettFaktura(int antallDager, int antallKilometer) {
        int totalPris = (dagsPris * antallDager) + (kmPris * antallKilometer) + returGebyr;
        return totalPris;
}
}
