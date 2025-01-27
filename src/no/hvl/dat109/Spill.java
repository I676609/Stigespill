package no.hvl.dat109;

import java.util.Scanner;

public class Spill {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hvor mange spillere?");
		int antall = sc.nextInt();

		Brett brett = new Brett(antall);
	}

}
