/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
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
	/**
     * The constructor of the Element.
     * 
     * @param type
     * 			The type of the element who define is place in the map.
     * @return
     *           
     */
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
	/**
     * The second constructor of the Element.
     * 
     * @param movement
     * 			The movement define the orientation of the Element if it's a player.
     * @return
     *           
     */
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
	/**
     * The getter of the Image.
     * 
     * @param 
     * @return BufferedImage
     *      Return the image of the Element.     
     */
	public BufferedImage getImage() {
		return image;
	}
	/**
     * The setter of the Image.
     * 
     * @param image
     * 		The new Image of the Element.
     * @return 
     *           
     */
	public void setImage(BufferedImage image) {
		this.image = image;
	}
	/**
     * The getter of the type.
     * 
     * @param 
     * @return Enum.Environment
     * 		Return the type of the Element.
     *         
     */
	public model.IEnvironment.Environment getType() {
		return this.type;
	}
	/**
     * The setter of the type
     * 
     * @param type
     * 		The new type of the Element. 
     * @return 
     *         
     */
	public void setType(model.IEnvironment.Environment type) {
		this.type = type;
	}
	/**
     * The getter of the movement
     * 
     * @param 
     * @return Enum.Direction
     * 		Return the movement of the Element.
     *         
     */
	public model.IDirection.Direction getMovement() {
		return this.movement;
	}
	/**
     * The setter of the movement.
     * 
     * @param mmovement
     * 		The new movement of the Element.
     * @return 
     *         
     */
	public void setMovement(model.IDirection.Direction movement) {
		this.movement = movement;
	}
	/**
     * The getter of the ImageIcon
     * 
     * @param 
     * @return  ImageIcon
     *         Return the ImageIcon of the Element.
     */
	public ImageIcon getImageIcon() {
		return imageIcon;
	}
	/**
     * The setter of the ImageIcon.
     * 
     * @param imageIcon
     * 		The new ImageIcon.
     * @return 
     *         
     */
	public void setImageIcon(ImageIcon imageIcon) {
		this.imageIcon = imageIcon;
	}
	/**
     * The fetter of the XSpriteImagePlayer.
     * 
     * @param 
     * @return XSpriteImagePlayer
     * 		Return the posX of the Sprite of the player for each movement.
     *         
     */
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
	/**
     * The fetter of the YSpriteImagePlayer.
     * 
     * @param 
     * @return XSpriteImagePlayer
     * 		Return the posX of the Sprite of the player for each movement.
     *         
     */
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
	/**
     * The fetter of the XSpriteImage.
     * 
     * @param 
     * @return XSpriteImage
     * 		Return the posX of the Sprite of the Element for each type.
     *         
     */
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
	/**
     * The fetter of the YSpriteImage.
     * 
     * @param 
     * @return YSpriteImage
     * 		Return the posY of the Sprite of the Element for each type.
     *         
     */
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
