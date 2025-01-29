package no.hvl.dat109.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.util.Queue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import no.hvl.dat109.Brett;
import no.hvl.dat109.Spiller;

public class TestBrett {
	Brett brett1;
	Brett brett2;
	Brett brett3;
	Brett brett4;

	@BeforeEach
	void setUp() {

		brett1 = new Brett(1);
		brett2 = new Brett(2);
		brett3 = new Brett(3);
		brett4 = new Brett(4);
	}
	
	@Test
	void testInit() {
		Queue<Spiller> ko = brett4.getSpillkoe();
		assertEquals(ko.size(), 4);
	}

	@Test
	void testOppdaterSpillposisjon() {
		int posfor = brett1.fremsteSpiller().getPlassering();

		brett1.OppdaterSpillerPosisjon(brett1.fremsteSpiller());

		assertNotEquals(posfor, brett1.fremsteSpiller().getPlassering());

	}
	
	@Test
	void testSjekkPosisjonEgenskaper() {
		Spiller spiller = brett1.fremsteSpiller();
		spiller.setPlassering(16);
		brett1.SjekkPlasseringsEgenskaper(spiller);
		assertEquals(spiller.getPlassering(), 6);
		
		
	}

}
