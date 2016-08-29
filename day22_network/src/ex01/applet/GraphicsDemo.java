package ex01.applet;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

public class GraphicsDemo extends Applet {
	public void paint(Graphics g){
		
		g.setColor(Color.pink);
		g.drawString("hOW aRe YoU", 150, 150);
		g.drawLine(20, 30, 20, 300);
		g.drawRect(70, 100, 30, 30);
		g.fillRect(170, 100, 30, 30);
		g.drawOval(70, 200, 30, 30);
		
		g.setColor(Color.green);
		g.fillOval(170, 200, 30, 30);
		g.drawArc(90, 150, 30, 30, 30, 270);
		g.setColor(Color.MAGENTA);
		g.fillArc(270, 150, 30, 30, 0, 180);
		
		setSize(700,500);
		
	}
}
