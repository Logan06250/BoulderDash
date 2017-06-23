/**
 * Provides all classes for the view component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.IMapGame;
import model.IModel;

public class PanelGame extends JPanel{

	private static final long serialVersionUID = 1L;
	IMapGame map;
	/**
	 * The constructor of the class
	 * @param model
	 * 		The map will be generated 
	 */
	public PanelGame(IModel model){
		this.map = model.getMap();
	}
	/**
	 *The method who paint the frame
	 * @param g
	 */
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(map.getGrid()[j][i].getImage(), j*16, i*16, this);
			}
		}
	}
	/**
	 *The method who repaint the frame.
	 * @param g
	 */
	public void repaint(Graphics g){
		super.repaint();
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(map.getGrid()[j][i].getImage(), j*16, i*16, this);
			}
		}
	}
}
