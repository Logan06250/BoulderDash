package model;

import view.IElement;

public class MapMotion {
	private IMapGame map;
	
	public MapMotion(IMapGame map){
		this.map = map;
	}
	
	public void moveElement(Direction direction, int posX, int posY){
		IElement bufferedElement = this.map.getElementOfGrid(posX, posY);
		this.map.getGrid()[posX][posY] = new Element(Environment.NOTHING);
		switch(direction){
		case UP:
			this.map.getGrid()[posX][posY+1] = bufferedElement;
			break;
		case DOWN:
			this.map.getGrid()[posX][posY-1] = bufferedElement;	
			break;
		case RIGHT:
			this.map.getGrid()[posX+1][posY] = bufferedElement;
			break;
		case LEFT:
			this.map.getGrid()[posX-1][posY] = bufferedElement;
			break;
		}
	}
}
