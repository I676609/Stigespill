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
