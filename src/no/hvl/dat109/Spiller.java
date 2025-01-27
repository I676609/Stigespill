package no.hvl.dat109;

import java.util.Random;

public class Spiller {
	private int plassering;
	private Farge farge;
	private boolean fengsel;

	/**
	 * Oppretter Spiller objektet med variabler
	 * 
	 * @param farge fra Brett klassen
	 */
	public Spiller(Farge farge) {
		this.plassering = 1;
		this.farge = farge;
		this.fengsel = false;

	}

	/**
	 * Triller terning og oppdatarer plasseringen. om du Triller 6 så får trille på
	 * nytt, om dette skjer 3 ganger blir du plassert i "fengsel" og må trille 6
	 * engang til for å komme deg ut.
	 * 
	 * 
	 */
	public void trillTerning() {
		Random rand = new Random();
		int tall = rand.nextInt(1, 7);
		if (fengsel && tall == 6) {
			fengsel = false;
		}
		if (fengsel) {
			return;
		}

		while (tall == 6 || tall == 12) {
			tall += rand.nextInt(1, 7);

		}
		if (tall == 18) {
			plassering = 0;
			fengsel = true;
		}
		int nyplass = plassering + tall;
		if (nyplass <= 100) {
			plassering = nyplass;
		}

	}

	/**
	 * 
	 * @return plassering til spiller på brettet.
	 */
	public int getPlassering() {
		return plassering;
	}

	/**
	 * 
	 * @param ny plassering til spiller.
	 */
	public void setPlassering(int plassering) {
		this.plassering = plassering;
	}

	public Farge getFarge() {
		return farge;
	}

	public void setFarge(Farge farge) {
		this.farge = farge;
	}

	public boolean isFengsel() {
		return fengsel;
	}

	public void setFengsel(boolean fengsel) {
		this.fengsel = fengsel;
	}

}
