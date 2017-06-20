package main;


import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.Element;
import model.Environment;
import model.Map;

public abstract class Main {

    public static void main(final String[] args) throws SQLException {
        
    	
    	Map map = new Map(1);
    	
    	//Element gridTest[][] = map.getGrid();
    	Graphics g = null;
    	
    	JFrame frame = new JFrame();
    	frame.setSize(800, 800);
    	JPanel panel = new JPanel();
    	panel.setLayout(null);
    	frame.add(panel);
    	
    	panel.setBounds(0, 0, 800, 800);
    	Element element = new Element(Environment.WALL);
    	JLabel label = new JLabel(new ImageIcon(element.getImage()));
    	panel.add(label);
    	label.setBounds(500, 500, 16, 16);
    	panel.setVisible(true);
    	label.setVisible(true);
    	frame.setVisible(true);
    	
    	g.drawImage(element.getImage(), 10, 10, (ImageObserver) element.getImage());

    	/*for(int i = 1; i <= 22; i++){
    		for(int j = 1; j <= 40; i++){
        		
        		
        	}
    	}*/
    	
    }

}
