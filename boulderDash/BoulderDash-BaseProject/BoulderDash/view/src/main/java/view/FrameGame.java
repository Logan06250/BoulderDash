package view;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

import model.IDirection.Direction;
import model.IModel;

public class FrameGame extends JFrame{


	private static final long serialVersionUID = 1L;



	private PanelGame panel;

	public FrameGame(IModel model){
		this.panel = new PanelGame(model);
		this.setContentPane(this.panel);	
		this.panel.setVisible(true);
		this.panel.setLayout(null);
		this.panel.setBounds(0, 0, 800, 800);
		System.out.println("Test1");
		JLabel label = new JLabel("Pressez une touche...");
		add(label, BorderLayout.CENTER);
		label.setBounds(200, 700, 300, 50);
		addKeyListener(new TitreKeyListener(model));

		pack();
	}

	public PanelGame getPanel() {
		return panel;
	}

	public void setPanel(PanelGame panel) {
		this.panel = panel;
	}
}

class TitreKeyListener implements KeyListener {
	private final IModel model;

	public TitreKeyListener(IModel model) {
		this.model = model;
	}

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

	public void keyReleased(KeyEvent e) {

	}

	public void keyTyped(KeyEvent e) {
	}
}
