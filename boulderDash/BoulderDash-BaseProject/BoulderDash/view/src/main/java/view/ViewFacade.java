package view;

import javax.swing.JOptionPane;

import model.IMapGame;
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

	}

	@Override
	public void showGame() {
		
		
	}
	@Override
	public void startGame(IMapGame MapGame) {
		frame = new FrameGame();
		frame.setVisible(true);
		frame.setSize(900, 900);
	}



}
