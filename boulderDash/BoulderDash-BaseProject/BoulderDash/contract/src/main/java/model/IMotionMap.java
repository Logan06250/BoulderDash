package model;

import model.IDirection.Direction;

public interface IMotionMap {

	public IElement[][] moveElement(model.IDirection.Direction direction, int posX, int posY, IElement grid[][]);

}
