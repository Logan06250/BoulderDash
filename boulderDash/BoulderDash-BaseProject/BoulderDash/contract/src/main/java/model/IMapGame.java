package model;

import view.IElement;

public interface IMapGame {
	public IElement[][] getGrid();
	public IElement getElementOfGrid(int posX, int posY);
	public int getDiamondNumber();
	public void setDiamondNumber(int nb);
	public void setGrid(IElement[][] grid);
	public void addElement(int i, int j, IElement element);

}
