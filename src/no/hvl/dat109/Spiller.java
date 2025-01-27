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
	 * Triller terningen 
	 * 
	 * 
	 */
	public int trillTerning() {
		Random rand = new Random();
		return rand.nextInt(1, 7);
		

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

	/**
	 * 
	 * @return fargen til spiller
	 */
	public Farge getFarge() {
		return farge;
	}

	public boolean isFengsel() {
		return fengsel;
	}

	public void setFengsel(boolean fengsel) {
		this.fengsel = fengsel;
	}

}
