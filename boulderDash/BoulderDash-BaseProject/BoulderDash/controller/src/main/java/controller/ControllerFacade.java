/**
 * Provides all classes for the controller component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package controller;

import java.sql.SQLException;

import model.IModel;
import view.IView;


public class ControllerFacade implements IController {

	private final IView  view;
	private final IModel model;

	/**
     * Constructor of ControllerFacade
     * 
     * @param view, model
     * 			The view and the model of the controller.
     * @return 
     */
	public ControllerFacade(final IView view, final IModel model) {
		super();
		this.view = view;
		this.model = model;
	}
	/**
     * The method who start the display of the view.
     * 
     * @param 
     * @return
     *           
     */
	public void start() throws SQLException {
		view.startGame(this.model);
		try {
			this.loop();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	/**
     * The getter of the controller
     * 
     * @param 
     * @return
	 * @throws InterruptedException 
     */
	public void loop() throws InterruptedException{
		while(true){
	    	Thread.sleep(100);
	    	this.view.updateGame();
	    	this.model.getMap().autoUpdateMap();
    	}
	}
	/**
     * The getter of the View
     * 
     * @param 
     * @return IView
     *           Return the view of the controller.
     */
	public IView getView() {
		return this.view;
	}
	/**
     * The getter of the model
     * 
     * @param 
     * @return IModel
     *          	Return the model of the controller. 
     */
	public IModel getModel() {
		return this.model;
	}
}
