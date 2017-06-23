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
	public void testGetMap(){
		IMapGame expected = null;
		try {
			expected = new  MapGame(2);
			assertEquals(expected, this.map.getMap());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testSetMap(){
		IMapGame expected = null;
		try {
			expected = new MapGame(2);
			this.map.setMap(2);
			assertEquals(expected, this.map.getMap());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
