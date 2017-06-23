/**
 * Provides all classes for the view component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package view;

import model.IModel;
public interface IView {
    void displayMessage(String message);
    void showMenu();
    void showGame();
	void updateGame();
	void startGame(IModel model);
}
