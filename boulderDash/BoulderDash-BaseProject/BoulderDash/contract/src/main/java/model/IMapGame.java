/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package model;

import model.IDirection.Direction;

public interface IMapGame {
	public IElement[][] getGrid();
	public IElement getElementOfGrid(int posX, int posY);
	public int getDiamondNumber();
	public void setDiamondNumber(int nb);
	public void setGrid(IElement[][] grid);
	public void addElement(int i, int j, IElement element);
	public void movingPlayer(model.IDirection.Direction direction, int posX, int posY);
	public void movePlayer(Direction direction);
	public void autoUpdateMap();

}
