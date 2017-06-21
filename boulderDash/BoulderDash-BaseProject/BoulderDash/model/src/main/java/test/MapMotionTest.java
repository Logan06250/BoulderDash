package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.Direction;
import model.Element;
import model.Environment;
import model.IMapGame;
import model.MapGame;
import model.MapMotion;

public class MapMotionTest {
	private IMapGame map;
	private MapMotion mapmotion;
	@Before
	public void setUp() throws SQLException{
		this.map = new MapGame(1);
		this.mapmotion = new MapMotion(map);
	}
	@Test
	public void testMoveElement(){
		Element expected1 = new Element(Environment.STARTER);
		Element expected2 = new Element(Environment.NOTHING);
		this.mapmotion.moveElement(Direction.UP,4,3);
		assertEquals(expected1,this.map.getElementOfGrid(4, 2));
		assertEquals(expected2,this.map.getElementOfGrid(4, 2));
	}
}
