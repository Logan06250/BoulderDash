package view;

import java.awt.Graphics;

import javax.swing.JPanel;

import model.IMapGame;

public class PanelGame extends JPanel{

	private static final long serialVersionUID = 1L;
	IMapGame mapGame;
	
	public PanelGame(IMapGame mapGame){
		this.mapGame = mapGame;
	}

	public void paintComponent(Graphics g){
		super.paintComponent(g);
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				g.drawImage(mapGame.getGrid()[j][i].getImage(), j*16, i*16, this);
			}
		}
	}
}
