package model;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;

import view.IElement;


public class Element implements IElement{

	private final int width = 16;
	private final int height = 16;
	
	private Environment type;
	private BufferedImage image;
	private ImageIcon imageIcon;

	public Element(Environment type){
		try{
			this.image = (ImageIO.read(new File("C:\\Users\\Logan\\Desktop\\74359.png"))).getSubimage(this.getXSpriteImage(type), this.getYSpriteImage(type), this.width, this.height);		
			this.setImageIcon(new ImageIcon(this.image));
		}
		catch(Exception e){
			System.out.println(e);
		}
		this.setType(type);
	}

	public BufferedImage getImage() {
		return image;
	}

	public void setImage(BufferedImage image) {
		this.image = image;
	}
	
	public Environment getType() {
		return type;
	}

	public void setType(Environment type) {
		this.type = type;
	}
	
	public ImageIcon getImageIcon() {
		return imageIcon;
	}

	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}

	
	public int getXSpriteImage(Environment type){
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
		case STARTER: tempV = 128;
		break;
		case FINISHER: tempV = 128;
		break;
		}
	return tempV;
	}
	
	public int getYSpriteImage(Environment type){
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
		case STARTER: tempV = 0;
		break;
		case FINISHER: tempV = 16;
		break;
		}
	return tempV;
	}



}
