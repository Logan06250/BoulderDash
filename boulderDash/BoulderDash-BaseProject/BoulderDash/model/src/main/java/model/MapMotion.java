package model;

public class MapMotion {
	private Map map;
	
	public void moveElement(Direction direction, int posX, int posY){
		Element bufferedElement = this.map.getGrid()[posX][posY];
		this.map.getGrid()[posX][posY] = new Element(Environment.NOTHING);
		switch(direction){
		case UP:
			this.map.getGrid()[posX][posY+1] = bufferedElement;
			break;
		case DOWN:
			this.map.getGrid()[posX][posY-1] = bufferedElement;	
			break;
		case RIGHT:
			this.map.getGrid()[posX][posX+1] = bufferedElement;
			break;
		case LEFT:
			this.map.getGrid()[posX][posX-1] = bufferedElement;
			break;
		}
	}
}
