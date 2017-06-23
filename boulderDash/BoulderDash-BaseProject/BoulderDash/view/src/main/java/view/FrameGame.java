/**
 * Provides all classes for the view component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import model.IDirection.Direction;
import model.IModel;

public class FrameGame extends JFrame{


	private static final long serialVersionUID = 1L;



	private PanelGame panel;
	
	/**
	 *The constructor of the FrameGame
	 * @param model
	 * 		the model for the frame
	 */
	public FrameGame(IModel model){
		this.panel = new PanelGame(model);
		this.setContentPane(this.panel);	
		this.panel.setVisible(true);
		this.panel.setLayout(null);
		this.panel.setBounds(0, 0, 800, 800);

		addKeyListener(new TitreKeyListener(model));

		pack();
	}
	/**
	 *The getter of the panel.
	 * @return panel
	 * 		Return the panel of the frame
	 */
	public PanelGame getPanel() {
		return panel;
	}
	/**
    *The setter of the panel.
    * @param panel
    * 		The new panel of the class.
    */
	public void setPanel(PanelGame panel) {
		this.panel = panel;
	}
}

class TitreKeyListener implements KeyListener {
	private final IModel model;
	/**
    *The listener of the keys.
    * @param model
    */
	public TitreKeyListener(IModel model) {
		this.model = model;
	}
	/**
    *The method who detect the key pressed.
    * @param e
    */
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == 37){
			model.getMap().movePlayer(Direction.LEFT);
		}
		if(e.getKeyCode() == 38){
			model.getMap().movePlayer(Direction.UP);
		}
		if(e.getKeyCode() == 39){
			model.getMap().movePlayer(Direction.RIGHT);
		}
		if(e.getKeyCode() == 40){
			model.getMap().movePlayer(Direction.DOWN);
		}
	}
	/**
    *The method who detect the key released.
    * @param e
    */
	public void keyReleased(KeyEvent e) {

	}
	/**
    *The method who detect the key typed.
    * @param e
    */
	public void keyTyped(KeyEvent e) {
	}
}
