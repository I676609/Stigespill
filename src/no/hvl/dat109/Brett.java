package no.hvl.dat109;

import java.util.LinkedList;
import java.util.Queue;

public class Brett {
	private Queue<Spiller> spillkoe;
	public Queue<Spiller> vinnerkoe;

	public Brett(int antall) {
		spillkoe = new LinkedList<>();
		vinnerkoe = new LinkedList<>();
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
			spiller.setPlassering(1);
			spiller.setFengsel(true);
		}
		int nyplass = spiller.getPlassering() + tall;
		if (nyplass <= 100) {
			spiller.setPlassering(nyplass);
		}
	}
/**
 * Sjekker om plassen til spilleren står på en "slange eller stige" og oppdaterer posisjonen utifra det.
 * @param spiller
 */
	public void SjekkPlasseringsEgenskaper(Spiller spiller) {
		int pos = spiller.getPlassering();
		switch (pos) {
		case 100:
		case 80:
			System.out.println("Spiller : " + spiller.getFarge() + " har kommet i mål!");
			spiller.setVunnet(true);
			spillkoe.remove(spiller);
			vinnerkoe.add(spiller);
			break;
			
		case 98: spiller.setPlassering(78);slangePrint(pos,spiller);break;
		case 95: spiller.setPlassering(75);slangePrint(pos,spiller); break;
		case 92: spiller.setPlassering(73);slangePrint(pos,spiller); break;
		case 87: spiller.setPlassering(24);slangePrint(pos,spiller); break;
		case 71: spiller.setPlassering(91);stigePrint(pos, spiller);break;
		case 64: spiller.setPlassering(60);slangePrint(pos,spiller);break;
		case 62: spiller.setPlassering(18);slangePrint(pos,spiller);break;
		case 56: spiller.setPlassering(53);slangePrint(pos,spiller);break;
		case 51: spiller.setPlassering(67);slangePrint(pos,spiller);break;
		case 49: spiller.setPlassering(11);stigePrint(pos, spiller);break;
		case 47: spiller.setPlassering(11);slangePrint(pos, spiller);break;
		case 36: spiller.setPlassering(44);stigePrint(pos, spiller);break;
		case 28: spiller.setPlassering(84);stigePrint(pos, spiller);break;
		case 21: spiller.setPlassering(42);stigePrint(pos, spiller);break;
		case 16: spiller.setPlassering(6);slangePrint(pos,spiller);break;
		case 6: spiller.setPlassering(31);stigePrint(pos, spiller);break;
		case 4: spiller.setPlassering(14);stigePrint(pos, spiller);break;
		case 2: spiller.setPlassering(38);stigePrint(pos, spiller);break;
		default: return;
		
		}

	}
	private void slangePrint(int pos, Spiller spiller) {
		System.out.println("Å nei " + spiller.getFarge() + " landet på en slange falt fra" + pos +  " ned til " + spiller.getPlassering());
	}
	private void stigePrint(int pos, Spiller spiller) {
		System.out.println("Spiller " + spiller.getFarge() + " var heldig og tok en stige helt fra " + pos +  " opp til " + spiller.getPlassering());
		
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
	public Spiller fremsteSpiller() {
		return spillkoe.peek();
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
