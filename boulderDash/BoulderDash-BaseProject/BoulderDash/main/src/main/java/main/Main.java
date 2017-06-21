package main;


import java.sql.SQLException;

import controller.ControllerFacade;
import model.Element;
import model.Environment;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main{

    public static void main(final String[] args) throws SQLException, InterruptedException {
    	ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

    	controller.start();
    	
    	try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
    	
    	Thread.sleep(5000);
    	controller.getModel().getMap().addElement(2, 2, new Element(Environment.WALL));
    	controller.getView().updateGame();
    	
    	 	
    }


}
