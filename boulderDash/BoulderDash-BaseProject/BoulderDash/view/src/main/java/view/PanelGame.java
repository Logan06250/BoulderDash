package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.IMapGame;
import model.IModel;

public class PanelGame extends JPanel{

	private static final long serialVersionUID = 1L;
	IMapGame map;
	
	public PanelGame(IModel model){
		this.map = model.getMap();
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(map.getGrid()[j][i].getImage(), j*16, i*16, this);
			}
		}
	}
	
	public void repaint(Graphics g){
		super.repaint();
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(map.getGrid()[j][i].getImage(), j*16, i*16, this);
			}
		}
	}
}
