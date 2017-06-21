package model;

import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;



public class Player {
	private boolean life = true ;
	private BufferedImage imagePlayer ;
	private Direction movement;
	private final int width = 16;
	private final int height = 16;
	
	public Player(Direction tempV){
		try{
			this.imagePlayer = (ImageIO.read(new File("C:\\Users\\Logan\\Desktop\\74336.png"))).getSubimage(this.getXSpriteImagePlayer(movement), this.getYSpriteImagePlayer(movement), this.width, this.height);			
		}
		catch(Exception e){
			System.out.println(e);
		}
		this.setTypePlayer(movement);
	}
	


	public BufferedImage getImagePlayer() {
		return imagePlayer;
	}

	public void setImagePlayer(BufferedImage imagePlayer) {
		this.imagePlayer = imagePlayer;
	}
	
	public Direction getTypePlayer() {
		return movement;
	}

	public void setTypePlayer(Direction movement) {
		this.movement = movement;
	}
	
	public int getXSpriteImagePlayer(Direction movement){
		int tempV = 0;
		switch(movement){
		case DOWN: tempV = 0; 
		break;
		case LEFT: tempV = 0; 
		break;
		case RIGHT : tempV = 0; 
		break;
		case UP: tempV = 32;
		break;
		}
	return tempV;
	}
	
	public int getYSpriteImagePlayer(Direction movement){
		int tempV = 0;
		switch(movement){
		case DOWN: tempV = 0;
		break;
		case LEFT: tempV = 16;
		break;
		case RIGHT : tempV = 48;
		break;
		case UP: tempV = 80;
		break;
		
		}
	return tempV;
	}
	
}
