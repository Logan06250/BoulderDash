/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package model;

import java.sql.SQLException;

import model.dao.BoulderDashBDDConnector;
public class MapGame implements IMapGame{
	private IElement grid[][] = new Element[41][23];
	private int diamondNumber;
	private int diamondToFinish;

	private int playerX;
	private int playerY;
	private boolean playerAlive;
	/**
	 * The constructor of the class.
	 * @param levelInt
	 * 			The level of the map.
	 * @return
	 *           
	 */
	public MapGame(int levelInt) throws SQLException{
		this.playerAlive = true;
		this.diamondNumber = 0;
		this.diamondToFinish = 0;
		this.generateMap(levelInt);

	}
	/**
	 * The method who add an element.
	 * @param posX, posY, element
	 * 			Adds an element with posX and posY.
	 * @return
	 *           
	 */
	public void addElement(int posX, int posY, IElement element){
		this.grid[posX][posY] = element;
	}
	/**
	 * The method who get an Element of a grid.
	 * @param posX, posY
	 * 			To get an Element with posX and posY.
	 * @return
	 *           
	 */
	public IElement getElementOfGrid(int posX, int posY){
		return this.grid[posX][posY];
	}
	/**
	 * The getter of the grid.
	 * @param 
	 * @return IElement[][]
	 *           Return the grid of the Map.
	 */
	public IElement[][] getGrid() {
		return this.grid;
	}
	/**The setter of the grid.
	 * 
	 * @param grid
	 * 			return the new grid of the map.
	 * @return
	 *           
	 */
	public void setGrid(IElement[][] grid) {
		this.grid = grid;
	}
	/**
	 * The getter of the DiamondNumber.
	 * @param 
	 * @return integer
	 * 		Return the DIamond Number.
	 *           
	 */
	public int getDiamondNumber() {
		return diamondNumber;
	}
	/**
	 * The setter of the DiamondNumber.
	 * @param diamondNumber
	 * 			The new DiamondNumber of the map.
	 * @return
	 *           
	 */
	public void setDiamondNumber(int diamondNumber) {
		this.diamondNumber = diamondNumber;
	}
	/**
	 * The Method who updateThe map, change the position of rocks, diamond, and monster.
	 * @param 
	 * @return
	 *           
	 */
	public void autoUpdateMap(){
		if(this.diamondToFinish == this.diamondNumber){
			this.playerAlive = false;
		}
		for(int i = 1; i <= 22; i++){
			for(int j = 1; j <= 40; j++){
				if(this.grid[j][i].getType() == model.IEnvironment.Environment.MONSTER){
					int choice  = (int) (Math.random() * 5 );
					if((this.grid[j-1][i].getType() == model.IEnvironment.Environment.NOTHING || this.grid[j-1][i].getType() == model.IEnvironment.Environment.PLAYER) && choice == 0){
						this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
						this.grid[j-1][i] = new Element(model.IEnvironment.Environment.MONSTER);
						if(this.grid[j-1][i].getType() == model.IEnvironment.Environment.PLAYER){
							this.playerAlive = false;
						}
					}
					if((this.grid[j][i-1].getType() == model.IEnvironment.Environment.NOTHING || this.grid[j][i-1].getType() == model.IEnvironment.Environment.PLAYER) && choice == 1){
						this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
						this.grid[j][i-1] = new Element(model.IEnvironment.Environment.MONSTER);
						if(this.grid[j][i-1].getType() == model.IEnvironment.Environment.PLAYER){
							this.playerAlive = false;
						}
					}
					if((this.grid[j+1][i].getType() == model.IEnvironment.Environment.NOTHING || this.grid[j+1][i].getType() == model.IEnvironment.Environment.PLAYER) && choice == 2){
						this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
						this.grid[j+1][i] = new Element(model.IEnvironment.Environment.MONSTER);
						if(this.grid[j+1][i].getType() == model.IEnvironment.Environment.PLAYER){
							this.playerAlive = false;
						}
					}
					if((this.grid[j][i+1].getType() == model.IEnvironment.Environment.NOTHING || this.grid[j][i+1].getType() == model.IEnvironment.Environment.PLAYER) && choice == 3){
						this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
						this.grid[j][i+1] = new Element(model.IEnvironment.Environment.MONSTER);
						if(this.grid[j][i+1].getType() == model.IEnvironment.Environment.PLAYER){
							this.playerAlive = false;
						}
					}
				}
				if(this.grid[j][i].getType() == model.IEnvironment.Environment.ROCK){
					if(this.grid[j][i+1].getType() == model.IEnvironment.Environment.NOTHING){
						if(this.grid[j][i+2].getType() == model.IEnvironment.Environment.PLAYER){
							IElement tempElement = this.grid[j][i];
							IElement tempElement2 = this.grid[j][i+1];
							this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
							this.grid[j][i+1] = tempElement2;
							this.grid[j][i+2] = tempElement;
							this.playerAlive = false;
						}else{
							IElement tempElement = this.grid[j][i];
							this.grid[j][i] = this.grid[j][i+1];
							this.grid[j][i+1] = tempElement;
						}
					}
				}
				if(this.grid[j][i].getType() == model.IEnvironment.Environment.DIAMOND){
					if(this.grid[j][i+1].getType() == model.IEnvironment.Environment.NOTHING){
						if(this.grid[j][i+2].getType() == model.IEnvironment.Environment.PLAYER){
							IElement tempElement = this.grid[j][i];
							IElement tempElement2 = this.grid[j][i+1];
							this.grid[j][i] = new Element(model.IEnvironment.Environment.NOTHING);
							this.grid[j][i+1] = tempElement2;
							this.grid[j][i+2] = tempElement;
							this.playerAlive = false;
						}else{
							IElement tempElement = this.grid[j][i];
							this.grid[j][i] = this.grid[j][i+1];
							this.grid[j][i+1] = tempElement;
						}
					}
				}
			}
		}
	}
	/**
	 * The method which change the orientation and the position of the player.
	 * @param direction, posX, posY
	 * 			The positions o the player and the movement associated.
	 * @return
	 *           
	 */
	public void movingPlayer(model.IDirection.Direction direction, int posX, int posY){
		if(playerAlive){
			switch(direction){
			case DOWN:
				if(this.grid[posX][posY+1].getType() == model.IEnvironment.Environment.WALL || this.grid[posX][posY+1].getType() == model.IEnvironment.Environment.ROCK){
					this.grid[posX][posY] = new Element(direction);
				}else if(this.grid[posX][posY+1].getType() == model.IEnvironment.Environment.MONSTER){
					this.playerAlive = false;
				}else{
					if(this.grid[posX][posY+1].getType() == model.IEnvironment.Environment.DIAMOND){
						this.diamondNumber++;
					}
					this.grid[posX][posY+1] = new Element(direction);
					this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
					playerY++;
				}
				break;
			case UP:
				if(this.grid[posX][posY-1].getType() == model.IEnvironment.Environment.WALL|| this.grid[posX][posY-1].getType() == model.IEnvironment.Environment.ROCK){
					this.grid[posX][posY] = new Element(direction);
				}else if(this.grid[posX][posY-1].getType() == model.IEnvironment.Environment.MONSTER){
					this.playerAlive = false;
				}else{
					if(this.grid[posX][posY-1].getType() == model.IEnvironment.Environment.DIAMOND){
						this.diamondNumber++;
					}
					this.grid[posX][posY-1] = new Element(direction);
					this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
					playerY--;
				}
				break;
			case RIGHT:
				if(this.grid[posX+1][posY].getType() == model.IEnvironment.Environment.WALL){
					this.grid[posX][posY] = new Element(direction);
				}else if(this.grid[posX+1][posY].getType() == model.IEnvironment.Environment.MONSTER){
					this.playerAlive = false;
				}else if(this.grid[posX+1][posY].getType() == model.IEnvironment.Environment.ROCK){
					if(this.grid[posX+2][posY].getType() == model.IEnvironment.Environment.NOTHING || this.grid[posX+2][posY].getType() == model.IEnvironment.Environment.MONSTER){
						this.grid[posX+2][posY] = this.grid[posX+1][posY];
						this.grid[posX+1][posY] = new Element(direction);
						this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
						playerX++;
					}
				}else{
					if(this.grid[posX+1][posY].getType() == model.IEnvironment.Environment.DIAMOND){
						this.diamondNumber++;
					}
					this.grid[posX+1][posY] = new Element(direction);
					this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
					playerX++;
				}
				break;
			case LEFT:
				if(this.grid[posX-1][posY].getType() == model.IEnvironment.Environment.WALL){
					this.grid[posX][posY] = new Element(direction);
				}else if(this.grid[posX-1][posY].getType() == model.IEnvironment.Environment.MONSTER){
					this.playerAlive = false;
				}else if(this.grid[posX-1][posY].getType() == model.IEnvironment.Environment.ROCK){
					if(this.grid[posX-2][posY].getType() == model.IEnvironment.Environment.NOTHING || this.grid[posX-2][posY].getType() == model.IEnvironment.Environment.MONSTER){
						this.grid[posX-2][posY] = this.grid[posX-1][posY];
						this.grid[posX-1][posY] = new Element(direction);
						this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
						playerX--;
					}
				}else{
					if(this.grid[posX-1][posY].getType() == model.IEnvironment.Environment.DIAMOND){
						this.diamondNumber++;
					}
					this.grid[posX-1][posY] = new Element(direction);
					this.grid[posX][posY] = new Element(model.IEnvironment.Environment.NOTHING);
					playerX--;
				}
				break;
			}
		}
	}
	/**
	 * The method who move a player
	 * @param direction
	 * 		Move the player with a direction.	
	 * @return
	 *           
	 */
	public void movePlayer(model.IDirection.Direction direction){

		movingPlayer(direction, playerX, playerY);
	}
	/**
	 * The method who generate the map and fill it with the BDD.
	 * @param levelId
	 * 			The level of the map.
	 * @return
	 *           
	 */
	public void generateMap(int levelId) throws SQLException{

		int result[] = new int[881];
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
				case 4 : tempV = model.IEnvironment.Environment.DIAMOND; diamondToFinish++; break;
				case 5 : tempV = model.IEnvironment.Environment.MONSTER; break;
				case 6 : tempV = model.IEnvironment.Environment.ROCK; break;
				case 7 : tempV = model.IEnvironment.Environment.PLAYER; break;
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
