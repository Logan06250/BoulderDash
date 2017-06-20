package main;


import java.sql.SQLException;

import model.dao.BoulderDashBDDConnector;

public abstract class Main {

    public static void main(final String[] args) throws SQLException {
        
    	int test[] = new int[900];
    	
    	BoulderDashBDDConnector test1 = new BoulderDashBDDConnector();
    	
    	test1.getLevelByLevelId(1, test);
    	
    	System.out.println(test[56]);
    }

}
