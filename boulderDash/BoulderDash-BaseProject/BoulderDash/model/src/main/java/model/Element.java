package model;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;


public class Element implements IElement{

	private final int width = 16;
	private final int height = 16;
	
	private model.IEnvironment.Environment type;
	private model.IDirection.Direction movement;
	
	private BufferedImage image;
	private ImageIcon imageIcon;
	
	public Element(model.IEnvironment.Environment type){
		this.type = type;
		try{	
			this.image = (ImageIO.read(new File("sprite/74359.png"))).getSubimage(this.getXSpriteImage(type), this.getYSpriteImage(type), this.width, this.height);
			this.setImageIcon(new ImageIcon(this.image));
		}
		catch(Exception e){
			System.out.println(e);
		}
		this.setType(type);
	}
	public Element(model.IDirection.Direction movement){
		this.type = model.IEnvironment.Environment.PLAYER;
		try{	
			this.image = (ImageIO.read(new File("sprite/74336.png"))).getSubimage(this.getXSpriteImagePlayer(movement), this.getYSpriteImagePlayer(movement), this.width, this.height);	
			this.setImageIcon(new ImageIcon(this.image));
		}
		catch(Exception e){
			System.out.println(e);
		}
		this.setMovement(movement);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public model.IEnvironment.Environment getType() {
		return this.type;
	}

	public void setType(model.IEnvironment.Environment type) {
		this.type = type;
	}
	
	public model.IDirection.Direction getMovement() {
		return this.movement;
	}
	public void setMovement(model.IDirection.Direction movement) {
		this.movement = movement;
	}

	
	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	
	public int getXSpriteImagePlayer(model.IDirection.Direction movement){
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
	
	public int getYSpriteImagePlayer(model.IDirection.Direction movement){
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
	
	public int getXSpriteImage(model.IEnvironment.Environment type){
		int tempV = 0;
		switch(type){
		case NOTHING: tempV = 0; 
		break;
		case WALL: tempV = 96; 
		break;
		case MUD : tempV = 16; 
		break;
		case DIAMOND: tempV = 64;
		break;
		case ROCK: tempV = 48;
		break;
		case MONSTER: tempV = 112;
		break;
		case PLAYER: tempV = 128;
		break;
		case FINISHER: tempV = 128;
		break;
		}
	return tempV;
	}
	
	public int getYSpriteImage(model.IEnvironment.Environment type){
		int tempV = 0;
		switch(type){
		case NOTHING: tempV = 16;
		break;
		case WALL: tempV = 0;
		break;
		case MUD : tempV = 0;
		break;
		case DIAMOND: tempV = 0;
		break;
		case ROCK: tempV = 0;
		break;
		case MONSTER: tempV = 0;
		break;
		case PLAYER: tempV = 0;
		break;
		case FINISHER: tempV = 16;
		break;
		}
	return tempV;
	}
}
