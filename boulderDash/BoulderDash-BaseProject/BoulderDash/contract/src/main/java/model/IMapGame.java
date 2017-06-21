package model;

import view.IElement;

public interface IMapGame {
	public IElement[][] getGrid();
	public IElement getElementOfGrid(int posX, int posY);
	public int getDiamondNumber();
	public void setDiamondNumber(int nb);
}
