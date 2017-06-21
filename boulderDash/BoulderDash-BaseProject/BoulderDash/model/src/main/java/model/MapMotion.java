package model;

public class MapMotion implements IMotionMap{

	
	public MapMotion(){

	}
	
	public IElement[][] moveElement(model.IDirection.Direction direction, int posX, int posY, IElement grid[][]){
		IElement bufferedElement = grid[posX][posY];
		grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
		switch(direction){
		case UP:
			grid[posX][posY+1] = bufferedElement;
			break;
		case DOWN:
			grid[posX][posY-1] = bufferedElement;	
			break;
		case RIGHT:
			grid[posX+1][posY] = bufferedElement;
			break;
		case LEFT:
			grid[posX-1][posY] = bufferedElement;
			break;
		}
		return grid;
	}



}
