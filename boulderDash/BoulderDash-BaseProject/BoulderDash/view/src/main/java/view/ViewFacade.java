/**
 * Provides all classes for the view component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package view;


import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import model.IModel;

public class ViewFacade implements IView {

	FrameGame frame;
	/**
	 *The constructor of the class
	 * @param 
	 * @return 
	 * 
	 */
	public ViewFacade() {
		super();
	}
	/**
	 *method which print a message
	 * @param 
	 * @return message
	 * 
	 */
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	/**
	 *
	 * @param 
	 * @return 
	 * 
	 */
	@Override
	public void showMenu() {
	}
	/**
	 *Method who Update the game
	 * @param 
	 * @return 
	 * s
	 */
	@Override
	public void updateGame() {
		frame.getPanel().revalidate();
		frame.setSize(905,420);
		frame.setSize(900,420);
	}
	@Override
	public void showGame() {
	}
	/**
	*Method who start the displaying of the game
	* @param 	 
	* @return 
	* 
	*/
	@Override
	public void startGame(IModel model) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                frame = new FrameGame(model);
	                frame.setVisible(true);
	        		frame.setSize(900, 420);
	            }
	        });
	}
}
