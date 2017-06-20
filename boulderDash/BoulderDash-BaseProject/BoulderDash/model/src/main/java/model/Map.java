package model;

public class Map {
	private Element grid[][];
	private int diamondNumber;
	private Player player;
	
	
	public Map(){
		player = new Player();
		//Creation of the grid with the BDD	
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
	
	
	
	
}
