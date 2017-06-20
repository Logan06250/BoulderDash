package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import model.Map;
import model.Element;

public class MapTest {
	private Map map;
	@Before
	public void setUp(){
		this.map = new Map();
	}
	@Test
	public void testGetDiamondNumber(){
		int expected = 5;
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
		
	}
	@Test
	public void testSetGrid(){
		
	}

}
