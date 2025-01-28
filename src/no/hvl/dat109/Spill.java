package no.hvl.dat109;

import java.util.Scanner;

public class Spill {

	public static void main(String[] args) throws InterruptedException {
		boolean spill = true;
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange spillere?");
		int antall = sc.nextInt();

		Brett brett = new Brett(antall);
		
		while(spill) {
			Spiller spiller = brett.fremsteSpiller();
			
		brett.OppdaterSpillerPosisjon(spiller);
		brett.SjekkPlasseringsEgenskaper(spiller);
		Thread.sleep(0);
		System.out.println(spiller.getFarge() + " er nå på poisjon " + spiller.getPlassering());
		brett.nesteSpiller();
		if(brett.fremsteSpiller() == null) {
			spill = false;
		}
		}
		
	System.out.println("Spillet er ferdig");
	for(int i = 1; i <= antall ;i++) {
		
		System.out.println(i + ". Plass: " + brett.vinnerkoe.poll().getFarge() );
		
	}
		
		
		
	}

}
