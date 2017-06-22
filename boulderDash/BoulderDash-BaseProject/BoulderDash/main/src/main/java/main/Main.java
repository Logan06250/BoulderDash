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
    	int cpt = 1;
    	while(true){
	    	Thread.sleep(200);
	    	controller.getView().updateGame();
	    	if(cpt > 2){
	    	controller.getModel().getMap().autoUpdateMap();
	    	cpt = 0;
	    	}
	    	cpt++;
    	}
    	 	
    }


}
