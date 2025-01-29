package no.hvl.dat109;

import java.util.Scanner;

public class Spill {

	/**
	 * Starter og styrer spillet. Spør brukeren hvor mange spillere som skal delta, 
	 * oppretter brettet og gjennomfører spillet ved å oppdatere spillerposisjoner 
	 * og sjekke egenskaper til plasseringene. Spillet avsluttes når det ikke er 
	 * flere spillere igjen.
	 *
	 * @throws InterruptedException hvis tråden blir avbrutt under venting (Thread.sleep).
	 */
	public void spill() throws InterruptedException {
		boolean spill = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange spillere?");
		int antall = sc.nextInt();

		Brett brett = new Brett(antall);

		while (spill) {
			Spiller spiller = brett.fremsteSpiller();

			brett.OppdaterSpillerPosisjon(spiller);
			brett.SjekkPlasseringsEgenskaper(spiller);
			Thread.sleep(0);
			System.out.println(spiller.getFarge() + " er nå på poisjon " + spiller.getPlassering());
			brett.nesteSpiller();
			if (brett.fremsteSpiller() == null) {
				spill = false;
			}
		}

		System.out.println("Spillet er ferdig");
		for (int i = 1; i <= antall; i++) {

			System.out.println(i + ". Plass: " + brett.vinnerkoe.poll().getFarge());

		}

	}

}
