package test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.Element;
import model.IElement;
import model.IEnvironment.Environment;
import model.IMapGame;
import model.MapGame;
/**
 * Provides all test for the MapGame.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */

public class MapTest {
	private IMapGame map;
	/**
	 * Instantiate map with the constructor in MapGame.
	 * @throws SQLException
	 */
	@Before
	public void setUp() throws SQLException{
		this.map = new MapGame(1);
	}
	/**
	 * The addElement's test using getElementOfGrid.
	 */
	@Test
	public void testAddElement(){
		IElement expected = new Element(Environment.WALL);
		this.map.addElement(2, 2, expected);
		assertEquals(expected, this.map.getElementOfGrid(1, 1));
	}
	/**
	 * The test of getter of ElementOfGrid.
	 */
	@Test
	public void testGetElementOfGrid(){
		IElement expected = new Element(Environment.WALL);
		assertEquals(expected, this.map.getElementOfGrid(1, 1));
	}
	/**
	 * The test of getDiamondNumber.
	 */
	@Test
	public void testGetDiamondNumber(){
		int expected = 0;
		assertEquals(expected,this.map.getDiamondNumber());
	}
	/**
	 * The test of the setDiamondNumber.
	 */
	@Test
	public void testSetDiamondNumber(){
		int expected = 5;
		this.map.setDiamondNumber(expected);
		assertEquals(expected,this.map.getDiamondNumber());
	}
	/**
	 * The test of the generator of the map.
	 */
	@Test
	public void testGenerateMap(){
		fail("didn't know how to make this test");
	}
	/**
	 * The test of the map updating
	 */
	@Test
	public void testAutoUpDateMap(){
		fail("too long to make on one day");
	}
	/**
	 * The test of the player's moving.
	 */
	@Test
	public void testMovingPlayer(){
		fail("too long to make on one day");
	}
	/**
	 * The test of getGrid
	 * @throws SQLException
	 */
	@Test
	public void testGetGrid() throws SQLException{
	Element expected = new Element(Environment.WALL);
	assertEquals(expected, this.map.getGrid()[1][1]);
	}
	/**
	 * The test of setGrid
	 */
	@Test
	public void testSetGrid(){
	IElement expected = new Element(Environment.MUD);
	this.map.setGrid(new Element[1][1]);
	assertEquals(expected, this.map.getGrid()[1][1]);
	}
}