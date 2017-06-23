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
    	while(true){
	    	Thread.sleep(500);
	    	controller.getView().updateGame();
	    	controller.getModel().getMap().autoUpdateMap();
    	}
    }
}
