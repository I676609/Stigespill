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
			break;
			
		case 98: spiller.setPlassering(78);break;
		case 95: spiller.setPlassering(75); break;
		case 92: spiller.setPlassering(73); break;
		case 87: spiller.setPlassering(24); break;
		case 71: spiller.setPlassering(91);break;
		case 64: spiller.setPlassering(60);break;
		case 62: spiller.setPlassering(18);break;
		case 56: spiller.setPlassering(53);break;
		case 51: spiller.setPlassering(67);break;
		case 49: spiller.setPlassering(11);break;
		case 47: spiller.setPlassering(11);break;
		case 36: spiller.setPlassering(44);break;
		case 28: spiller.setPlassering(84);break;
		case 21: spiller.setPlassering(42);break;
		case 16: spiller.setPlassering(6);break;
		case 6: spiller.setPlassering(31);break;
		case 4: spiller.setPlassering(14);break;
		case 2: spiller.setPlassering(38);break;
		default: return;
		
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
