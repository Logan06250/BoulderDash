/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package model;

public interface IMotionMap {

	public IElement[][] moveElement(model.IDirection.Direction direction, int posX, int posY, IElement grid[][]);

}
