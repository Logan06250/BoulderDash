package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.Map;

public class MapTest {
	private Map map;
	@Before
	public void setUp() throws SQLException{
		this.map = new Map(1);
	}
	@Test
	public void testGetDiamondNumber(){
		int expected = 0;
		assertEquals(expected,map.getDiamondNumber());
	}
	@Test
	public void testSetDiamondNumber(){
		int expected = 2;
		map.setDiamondNumber(expected);
		assertEquals(expected,map.getDiamondNumber());
	}
	@Test
	public void testGetGrid(){
		fail("not yet implemented");
	}
	@Test
	public void testSetGrid(){
		fail("not yet implemented");
	}

}
