import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	private GradeBook g1, g2;
	
	@BeforeEach
	void setUp() throws Exception {
		g1 = new GradeBook(5);
		g2 = new GradeBook(5);
		g1.addScore(17.1);
		g1.addScore(32.1);
		g1.addScore(90.8);
		g2.addScore(25);
		g2.addScore(34.5);
		
	}

	@AfterEach
	void tearDown() throws Exception {
		g1 = null;
		g2 = null;
		
	}

	@Test
	public void testAddScore() {
		assertTrue(g1.toString().equals("17.1 32.1 90.8 0.0 0.0 "));
		assertTrue(g2.toString().equals("25.0 34.5 0.0 0.0 0.0 "));
		assertEquals(3, g1.getScoreSize());
		assertEquals(2, g2.getScoreSize());
	}
	
	@Test
	public void testSum()
	{
		assertEquals(140.0, g1.sum());
		assertEquals(59.5, g2.sum());
	}
	
	@Test
	public void testMinumum() {
		assertEquals(17.1, g1.minimum());
		assertEquals(25.0, g2.minimum());
	}

	@Test
	public void testFinalScore()
	{
		assertEquals(122.9, g1.finalScore());
		assertEquals(34.5, g2.finalScore());
	}
}
