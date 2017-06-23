package model;

import java.sql.SQLException;

public class ModelFacade implements IModel {

	IMapGame map;

	public ModelFacade() {
		this.setMap(1);
	}

	public void setMap(int id){
		try {
			map = new MapGame(id);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public IMapGame getMap(){
		return this.map;
	}

	
}

