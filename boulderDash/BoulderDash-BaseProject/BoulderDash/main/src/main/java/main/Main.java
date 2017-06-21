package main;


import java.sql.SQLException;

import controller.ControllerFacade;
import model.Element;
import model.Environment;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main{

    public static void main(final String[] args) throws SQLException {
        
    	ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

    	controller.start();
    	
    	try {
			Thread.sleep(100000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	
    	controller.getModel().getMap().addElement(20, 20, new Element(Environment.WALL));
    	
    	 	
    }


}
