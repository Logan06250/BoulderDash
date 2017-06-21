package model;

import java.sql.SQLException;

import model.dao.BoulderDashBDDConnector;

public class MapGame implements IMapGame{
	private IElement grid[][] = new Element[50][50];
	private int diamondNumber = 0;

	int playerX;
	int playerY;

	public MapGame(int levelInt) throws SQLException{
		this.generateMap(levelInt);
	}
	public void addElement(int posX, int posY, IElement element){
		this.grid[posX][posY] = element;
	}
	public IElement getElementOfGrid(int posX, int posY){
		return this.grid[posX][posY];
	}
	public IElement[][] getGrid() {
		return this.grid;
	}
	public void setGrid(IElement[][] grid) {
		this.grid = grid;
	}
	public int getDiamondNumber() {
		return diamondNumber;
	}
	public void setDiamondNumber(int diamondNumber) {
		this.diamondNumber = diamondNumber;
	}

	public void moveElement(model.IDirection.Direction direction, int posX, int posY){
		this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
		switch(direction){
		case DOWN:
			this.grid[posX][posY+1] = new Element(direction);
			playerY++;
			break;
		case UP:
			this.grid[posX][posY-1] = new Element(direction);
			playerY--;
			break;
		case RIGHT:
			this.grid[posX+1][posY] = new Element(direction);
			playerX++;
			break;
		case LEFT:
			this.grid[posX-1][posY] = new Element(direction);
			playerX--;
			break;
		}
	}

	public void movePlayer(model.IDirection.Direction direction){

		moveElement(direction, playerX, playerY);
	}


	public void generateMap(int levelId) throws SQLException{

		int result[] = new int[900];
		int incr = 1;
		BoulderDashBDDConnector connection = new BoulderDashBDDConnector();
		connection.getLevelByLevelId(levelId, result);

		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				model.IEnvironment.Environment tempV = model.IEnvironment.Environment.MUD;
				switch (result[incr]){
				case 1 : tempV = model.IEnvironment.Environment.NOTHING; break;
				case 2 : tempV = model.IEnvironment.Environment.WALL; break;
				case 3 : tempV = model.IEnvironment.Environment.MUD; break;
				case 4 : tempV = model.IEnvironment.Environment.DIAMOND; break;
				case 5 : tempV = model.IEnvironment.Environment.MONSTER; break;
				case 6 : tempV = model.IEnvironment.Environment.ROCK; break;
				case 7 : tempV = model.IEnvironment.Environment.STARTER; break;
				case 8 : tempV = model.IEnvironment.Environment.FINISHER; break;
				}
				try{
					if(result[incr] == 7){
						Element element = new Element(model.IDirection.Direction.DOWN);
						this.addElement(j, i, element);
						this.playerX = j;
						this.playerY = i;
					}
					else{
						Element element = new Element(tempV);
						this.addElement(j, i, element);
					}
				}
				catch(Exception e){
					System.out.println(e);
				}
				incr++;
			}
		}
	}
}
