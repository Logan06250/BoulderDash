/**
 * Provides all classes for the main component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package main;


import java.sql.SQLException;

import controller.ControllerFacade;
import model.Element;
import model.Environment;
import model.ModelFacade;
import view.ViewFacade;

public abstract class Main{
	/**
     * The main class of the project.
     * 
     * @param args
     * 		When we call this program, we can add parameters.
     * @return 
     *           
     */
    public static void main(final String[] args) throws SQLException, InterruptedException {
    	ControllerFacade controller = new ControllerFacade(new ViewFacade(), new ModelFacade());

    	controller.start();
    	while(true){
	    	Thread.sleep(100);
	    	controller.getView().updateGame();
	    	controller.getModel().getMap().autoUpdateMap();
    	}
    }
}
