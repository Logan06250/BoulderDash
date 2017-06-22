package test;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.IMapGame;
import model.MapGame;
import model.ModelFacade;

public class ModelFacadeTest {
	ModelFacade map;
	@Before
	public void setUp() throws SQLException{
		this.map = new ModelFacade();
				}
	@Test
	public void testGetMap() throws SQLException {
		IMapGame expected = new  MapGame(3);
		assertEquals(expected, this.map.getMap());
	}
	@Test
	public void testSetMap() throws SQLException{
		IMapGame expected = new MapGame(2);
		this.map.setMap(2);
		assertEquals(expected, this.map.getMap());
	}

}
