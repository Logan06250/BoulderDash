package test;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.IMapGame;
import model.MapGame;

public class MapMotionTest {
	private IMapGame map;
	@Before
	public void setUp() throws SQLException{
		this.map = new MapGame(1);
	}
	@Test
	public void testMoveElement(){
		fail("not yet implemented");
	}
}
