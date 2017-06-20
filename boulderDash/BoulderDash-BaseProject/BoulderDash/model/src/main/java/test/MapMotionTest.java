package test;

import static org.junit.Assert.fail;

import java.sql.SQLException;

import org.junit.Before;
import org.junit.Test;

import model.Map;

public class MapMotionTest {
	private Map map;
	@Before
	public void setUp() throws SQLException{
		this.map = new Map(1);
	}
	@Test
	public void testMoveElement(){
		fail("not yet implemented");
	}
}
