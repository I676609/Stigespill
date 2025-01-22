package no.hvl.dat109;

import java.util.LinkedList;
import java.util.Queue;

public class Brett {
	private Queue<Spiller> spillkoe;
	

	public Brett(int antall) {
		spillkoe = new LinkedList<>();
		for (int i = 0; i < antall; i++) {
			spillkoe.add(new Spiller(Farge.values()[i]));

		}

	}

	public void SjekkPlasseringsEgenskaper(Spiller spiller) {
		int pos = spiller.getPlassering();
		switch(pos) {
		case 100:
		case 80:
			System.out.println("Spiller : " +spiller.getFarge() + "har kommet i mål!");
				
		}

	}

	public void nesteSpiller() {

	}

	public Spiller getSpiller(Farge farge) {
		for (Spiller s : spillkoe) {
			if (s.getFarge().equals(farge)) {
				return s;

			}

		}
		return null;

	}
}
