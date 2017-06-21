package view;


import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import model.IModel;

public class ViewFacade implements IView {

	FrameGame frame;

	public ViewFacade() {
		super();

	}
	
	@Override
	public final void displayMessage(final String message) {
		JOptionPane.showMessageDialog(null, message);
	}
	
	@Override
	public void showMenu() {

	}
	
	@Override
	public void updateGame() {
		frame.getPanel().revalidate();
		frame.setSize(910,900);
		frame.setSize(900, 900);
	}

	@Override
	public void showGame() {

	}
	
	@Override
	public void startGame(IModel model) {
		 SwingUtilities.invokeLater(new Runnable() {
	            public void run() {
	                frame = new FrameGame(model);
	                frame.setVisible(true);
	        		frame.setSize(900, 900);
	            }
	        });
	}
}
