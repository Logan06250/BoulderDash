/**
 * Provides all classes for the model component.
 *
 * @author Lamouar Logan (logan.lamouar@viacesi.fr), Mickael Calvier (mickael.calvier@viacesi.fr), Sylvain Lerest (Sylvain.lerest@viacesi.fr)
 * @version 1.1
 */
package model;

import java.sql.SQLException;

public class ModelFacade implements IModel {

	IMapGame map;
	/**
     * The constructor of the class.
     * 
     * @param id
     * 		Choose the level.
     * @return 
     *           
     */
	public ModelFacade(int id) {
		this.setMap(id);
	}
	/**
     * The setter of the map
     * 
     * @param id
     * 		The level of the map.
     * @return 
     *           
     */
	public void setMap(int id){
		try {
			map = new MapGame(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/**
     * The getter of the map.
     * 
     * @param 
     * @return IMapGame.
     * 		The map of the model.
     *           
     */
	public IMapGame getMap(){
		return this.map;
	}
}


