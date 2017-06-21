package view;

import javax.swing.JFrame;

import model.IMapGame;
import model.IModel;

public class FrameGame extends JFrame{
	private static final long serialVersionUID = 1L;
	
	IMapGame mapGame;

	private PanelGame panel;

	public FrameGame(IMapGame mapGame){
		this.panel = new PanelGame(mapGame);
		this.setContentPane(this.panel);	
		this.panel.setVisible(true);
		this.panel.setLayout(null);
		this.panel.setBounds(0, 0, 800, 800);
		}


}
