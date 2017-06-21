package model;

import java.awt.Image;
import java.awt.image.BufferedImage;

import model.IEnvironment.Environment;

public interface IElement {

	Image getImage();
	void setImage(BufferedImage image);
	public Environment getType();


}
