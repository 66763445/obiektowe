package agh.cs.lab3;

import static org.junit.Assert.*;

import org.junit.Test;

public class MapDirectionTest {

	@Test
	public void test() {
		assertEquals(MapDirection.West.next(), MapDirection.North);
		assertEquals(MapDirection.North.next(), MapDirection.South);
	}

}
