package fr.uvsq.coo.ex3_2;

import org.junit.Test;

import junit.framework.TestCase;

public class BowlingTest extends TestCase {
	private Game g;
	protected void setUp() throws Exception {
		g=new Game();
		
		
	}

	public void testGutterGame() throws Exception {
   int n=20;
    int pins =0;
     rollMany1(n,pins);
	//	Game g = new Game();
//
//		for (int i = 0; i < n; i++)
//			g.roll(pins);
		assertEquals(0, g.score());
	}
	
	private void rollMany1(int n,int pins){
		for (int i = 0; i < n; i++) {
			g.roll(pins);
		}
		
		
	}

	public void testAllones() throws Exception {
		Game g = new Game();

		for (int i = 0; i < 20; i++)
			g.roll(1);
		assertEquals(20, g.score());

	}

}
