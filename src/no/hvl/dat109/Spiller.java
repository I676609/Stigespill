package no.hvl.dat109;

import java.util.Random;

public class Spiller {
	private int plassering;
	private Farge farge;
	private boolean fengsel;
	private boolean vunnet;

	/**
	 * Oppretter Spiller objektet med variabler
	 * 
	 * @param farge
	 * 
	 * @param farge fra Brett klassen
	 */
	public Spiller(Farge farge) {
		this.plassering = 1;
		this.farge = farge;
		this.fengsel = false;
		this.vunnet = false;

	}

	/**
	 * Triller terningen og skriver ut hva verdi terningen hadde
	 * @return Int verdi av terning kast
	 * 
	 * 
	 */
	public int trillTerning() {
		Random rand = new Random();
		int kast = rand.nextInt(1, 7);
		System.out.println(this.farge + " trillet " + kast);
		return kast;

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

	public Boolean isVunnet() {
		return vunnet;
	}

	public void setVunnet(boolean vunnet) {
		this.vunnet = vunnet;
	}

}
