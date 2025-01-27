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

	public void OppdaterSpillerPosisjon(Spiller spiller) {
		int tall = spiller.trillTerning();
		if (spiller.isFengsel() && tall == 6) {
			spiller.setFengsel(false);
		}
		if (spiller.isFengsel()) {
			return;
		}

		while (tall == 6 || tall == 12) {
			tall += spiller.trillTerning();

		}
		if (tall == 18) {
			spiller.setPlassering(0);
			spiller.setFengsel(true);
		}
		int nyplass = spiller.getPlassering() + tall;
		if (nyplass <= 100) {
			spiller.setPlassering(nyplass);
		}
	}

	public void SjekkPlasseringsEgenskaper(Spiller spiller) {
		int pos = spiller.getPlassering();
		switch (pos) {
		case 100:
		case 80:
			System.out.println("Spiller : " + spiller.getFarge() + "har kommet i mål!");

		}

	}

	/**
	 * Tar ut den fremste spilleren og legger den til igjen bakerst i køen
	 * 
	 * @return neste spiller
	 */
	public void nesteSpiller() {
		Spiller temp = spillkoe.poll();
		spillkoe.add(temp);

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
