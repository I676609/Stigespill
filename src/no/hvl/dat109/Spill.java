package no.hvl.dat109;

import java.util.Scanner;

public class Spill {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange spillere?");
		int antall = sc.nextInt();

		Brett brett = new Brett(antall);
		
		while(true) {
			Spiller spiller = brett.fremsteSpiller();
			
		brett.OppdaterSpillerPosisjon(spiller);
		brett.SjekkPlasseringsEgenskaper(spiller);
		Thread.sleep(500);
		System.out.println(spiller.getFarge() + "er på poisjon" + spiller.getPlassering());
		brett.nesteSpiller();
		}
		
		
		
		
		
	}

}
