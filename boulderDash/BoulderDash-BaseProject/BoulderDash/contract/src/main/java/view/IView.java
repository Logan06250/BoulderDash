package view;

import model.IMapGame;
import model.IModel;

/**
 * <h1>The Interface IView.</h1>
 *
 * @author Jean-Aymeric DIET jadiet@cesi.fr
 * @version 1.0
 */
public interface IView {

    /**
     * Display message.
     *
     * @param message
     *            the message
     */
    void displayMessage(String message);
    void showMenu();
    void showGame();
	void updateGame();
	void startGame(IMapGame iMapGame);
}
