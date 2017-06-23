/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package model;

import java.awt.Image;
import java.awt.image.BufferedImage;

import model.IEnvironment.Environment;

public interface IElement {

	Image getImage();
	void setImage(BufferedImage image);
	public Environment getType();


}
