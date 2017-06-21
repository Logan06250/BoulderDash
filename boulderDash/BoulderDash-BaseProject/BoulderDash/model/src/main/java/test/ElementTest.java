package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import model.Element;
import model.Environment;
import model.Direction;

public class ElementTest {
	private Element element;
	private Element player;
	@Before
	public void setUp(){
		this.element = new Element(Environment.DIAMOND);
		this.player = new Element(Direction.DOWN);
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
	public void testGetMovement(){
		Direction expected = Direction.DOWN;
		assertEquals(expected, player.getMovement());
	}
	@Test
	public void testSetMovement(){
		Direction expected = Direction.UP;
		player.setMovement(expected);
		assertEquals(expected, player.getMovement());
	}
	@Test
	public void testGetXSpriteImagePlayer(){
		int expected = 0;
		assertEquals(expected, player.getXSpriteImagePlayer(Direction.DOWN));
	}
	@Test
	public void testGetYSpriteImagePlayer(){
		int expected = 16;
		assertEquals(expected, player.getYSpriteImagePlayer(Direction.DOWN));
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
