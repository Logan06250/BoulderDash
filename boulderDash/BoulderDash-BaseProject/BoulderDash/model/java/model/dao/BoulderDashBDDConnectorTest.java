package model.dao;

import static org.junit.Assert.*;

import java.sql.SQLException;

import org.junit.Test;
import org.junit.Before;

public class BoulderDashBDDConnectorTest {
	BoulderDashBDDConnector connection;
	@Before
	public void setUpBefore(){
		try {
			this.connection = new BoulderDashBDDConnector();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@Test
	public void testGetLevelByLevelId(){
		 
	}

}
