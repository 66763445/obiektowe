package agh.cs.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class PositionTest {

	@Test
	public void testToString() {
		assertEquals("(1,2)", new Position(1,2).toString());
	}
	@Test
	public void testSmaller() {
		assertTrue(new Position(1,2).smaller(new Position(3,4)));
		assertFalse(new Position(3,4).smaller(new Position(1,2)));
	}
	
}
