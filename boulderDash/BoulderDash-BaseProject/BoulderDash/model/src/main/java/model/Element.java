package model;
import java.awt.image.BufferedImage;
import java.io.*;

import javax.imageio.ImageIO;

public class Element {
	

	final int width = 16;
	final int height = 16;

	
	
	private Environment type;
	private BufferedImage image;
	public Environment getType() {
		return type;
	}
	public Element(Environment type){
		
		try{
			
			BufferedImage[] bufferedImage = new BufferedImage[1];
			this.image = ImageIO.read(new File("74359.png"));
			bufferedImage[1] = this.image.getSubimage( 4 * width, 3 * height, width, height);
			
			}
			catch(Exception e){
				System.out.println(e);
			}
		

				 
	}
	public void setType(Environment type) {
		this.type = type;
	}
}
