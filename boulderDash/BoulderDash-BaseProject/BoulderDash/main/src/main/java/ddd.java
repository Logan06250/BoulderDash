

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ddd extends JPanel {

	public void paint(Graphics g) {
		Image img = createImage();
		g.drawImage(img, 20,20,this);
		System.out.println("test1");
	}

	public static void main(String[] args) {
		System.out.println("test2");
		JFrame frame = new JFrame();
		System.out.println("test2");
		frame.getContentPane().add(new ddd());
		System.out.println("test2");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		System.out.println("test2");
		frame.setSize(600, 600);
		System.out.println("test2");
		frame.setVisible(true);
		System.out.println("test2");

	}

	private Image createImage(){
		System.out.println("test3");
		BufferedImage bufferedImage = new BufferedImage(200,200,BufferedImage.TYPE_INT_RGB);
		Graphics g = bufferedImage.getGraphics();
		g.drawString("www.java2s.com", 50,20);

		return bufferedImage;
	}
}


