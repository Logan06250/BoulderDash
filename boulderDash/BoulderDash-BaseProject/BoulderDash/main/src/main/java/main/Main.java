package main;


import java.sql.SQLException;

import controller.ControllerFacade;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main{

    public static void main(final String[] args) throws SQLException {
        
    	ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

    	controller.start();
    	
    	 	
    }


}
