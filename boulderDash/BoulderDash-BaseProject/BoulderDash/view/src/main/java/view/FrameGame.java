package view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

import model.IMapGame;

public class FrameGame extends JFrame implements KeyListener{
	

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
	
	public PanelGame getPanel() {
		return panel;
	}

	public void setPanel(PanelGame panel) {
		this.panel = panel;
	}


	@Override
	public void keyPressed(KeyEvent arg0) {
		this.panel.setVisible(false);
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		
	}


}
