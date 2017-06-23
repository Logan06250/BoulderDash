package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoulderDashBDDConnector {

    private String                  user     = "root";
    private String                  password = "";
    private String                  url      = "jdbc:mysql://localhost/boulderdash?useSSL=false&serverTimezone=UTC";

    public BoulderDashBDDConnector() throws SQLException {
    }
    
    public int[] getLevelByLevelId(int id, int resultTab[]){
    		
    	try{
        Connection connection = DriverManager.getConnection(this.url, this.user, this.password);
        Statement statement = connection.createStatement();
    	ResultSet result = statement.executeQuery("CALL getLevel(" + id + ")");
    	int i = 1;
    	
    	while(result.next()){
    		resultTab[i] = Integer.parseInt(result.getObject(1).toString());
	    	i++;
	    	}
    	result.close();
    	statement.close();
    	}
    	catch(Exception e){
    		System.out.println("Erreur");
    		System.out.println(e);
    	}
		return resultTab;
    }
}
