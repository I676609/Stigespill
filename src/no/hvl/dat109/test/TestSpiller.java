package no.hvl.dat109.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import no.hvl.dat109.Farge;
import no.hvl.dat109.Spiller;

class TestSpiller {
	private Spiller spiller = new Spiller(Farge.BLÅ);

	@Test
	void testTrillTerning() {
		int tall = spiller.trillTerning();
		assertTrue(tall >= 1);
		assertTrue(tall <= 6);
	}

}
