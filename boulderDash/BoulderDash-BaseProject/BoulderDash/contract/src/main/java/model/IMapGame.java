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
