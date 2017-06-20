package model;

import java.sql.SQLException;

import model.dao.BoulderDashBDDConnector;

public class Map {
	private Element grid[][];
	private int diamondNumber = 0;
	private Player player;
	
	
	public Map(int levelInt) throws SQLException{
		player = new Player();
		Element grid[][] = new Element[41][23];
		this.generateMap(levelInt);
	}
	public void addElement(int posX, int posY, Element element){
		this.grid[posX][posY] = element;
	}
	public Element[][] getGrid() {
		return grid;
	}
	public void setGrid(Element[][] grid) {
		this.grid = grid;
	}
	public int getDiamondNumber() {
		return diamondNumber;
	}
	public void setDiamondNumber(int diamondNumber) {
		this.diamondNumber = diamondNumber;
	}
	
	public Player getPlayer(){
		return player;
	}
	
	public void generateMap(int levelId) throws SQLException{
		
		int result[] = new int[900];
		int incr = 1;
		BoulderDashBDDConnector connection = new BoulderDashBDDConnector();
		connection.getLevelByLevelId(levelId, result);
			
		for(int i = 1; i < 22; i++){
			for(int j = 1; j < 40; j++){
				Environment tempV = Environment.MUD;
				switch (result[incr]){
				case 1 : tempV = Environment.NOTHING; break;
				case 2 : tempV = Environment.WALL; break;
				case 3 : tempV = Environment.MUD; break;
				case 4 : tempV = Environment.DIAMOND; break;
				case 5 : tempV = Environment.MONSTER; break;
				case 6 : tempV = Environment.ROCK; break;
				case 7 : tempV = Environment.STARTER; break;
				case 8 : tempV = Environment.FINISHER; break;
				}
				try{
					Element element = new Element(tempV);
				this.addElement(j, i, element);
				}
				catch(Exception e){
					System.out.println(e);
				}
				incr++;
			}
		}
	}
}
