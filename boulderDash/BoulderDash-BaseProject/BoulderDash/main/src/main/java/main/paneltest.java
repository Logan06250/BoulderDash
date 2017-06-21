package main;

import java.awt.Graphics;
import java.sql.SQLException;

import javax.swing.JPanel;

import model.IMapGame;
import model.MapGame;

public class paneltest extends JPanel{
	
	private static final long serialVersionUID = 1L;
	IMapGame map;
	
	public paneltest()throws SQLException{
		this.map = new MapGame(3);
	}
	
	 public void paintComponent(Graphics g){
	    	super.paintComponent(g);
	    	for(int i = 1; i <= 22; i++){
	    		for(int j = 1; j <= 40; j++){
		    		
	    			g.drawImage(map.getGrid()[j][i].getImage(), j*16, i*16, this);
	    			
		    	}
	    		
	    	}
	    	
	    	
	    }

}
