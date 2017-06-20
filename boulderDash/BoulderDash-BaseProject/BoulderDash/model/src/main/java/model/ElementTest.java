package model;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class ElementTest {
	private Element element;
	@Before
	public void setUp(){
		this.element = new Element(Environment.DIAMOND);
	}
	@Test
	public void testGetType(){
		Environment expected = Environment.DIAMOND;
		assertEquals(expected, element.getType());
	}
	@Test
	public void testSetType(){
		Environment expected = Environment.WALL;
		element.setType(expected);
		assertEquals(expected, element.getType());
	}
	@Test
	public void testGetXSpriteImage(){
		int expected = 64;
		assertEquals(expected, element.getXSpriteImage(element.getType()));
	}
	@Test
	public void testGetYSpriteImage(){
		int expected = 16;
		assertEquals(expected, element.getYSpriteImage(Environment.NOTHING));
	}
}
