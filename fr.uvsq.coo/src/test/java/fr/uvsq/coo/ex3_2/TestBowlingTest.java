package fr.uvsq.coo.ex3_2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowlingTest {
	private Game g;

	protected void setUp() throws Exception {
		g = new Game();

	}

	@Test
	public void testGutterGame() throws Exception {
		int n = 20;
		int pins = 0;
		 Game g = new Game();

		// for (int i = 0; i < n; i++)
		// g.roll(pins);
		//rollMany1(n, pins);
		assertEquals(0, g.score());
	}

	public void rollMany1(int n, int p) {
		for (int i = 0; i < n; i++)
			g.roll(p);
	}

	public void testAllones() throws Exception {
		Game g = new Game();
		for (int i = 0; i < 20; i++)
			g.roll(1);
		assertEquals(20, g.score());

	}

}
