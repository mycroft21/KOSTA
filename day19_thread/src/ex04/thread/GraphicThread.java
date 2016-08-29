package ex04.thread;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

import javax.swing.JFrame;

import org.w3c.dom.css.Rect;

public class GraphicThread extends JFrame implements Runnable {

	int x,y, num;
	Color color;
	Random random;
	
	
	public GraphicThread(int num) {//생성자함수= 초기화

		this.num = num;
		color = Color.cyan;
		random = new Random();
		
		setSize(500,400);//프레임 크기 = 너비,높이
		setVisible(true);//화면 표시
		setLocation(750, 300);//위치조절
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//닫기
	}
	
	@Override
	public void run() {
		Rectangle rect = getBounds();
		for(int i = 0; i < num; i++){
			x = random.nextInt(rect.width);
			y = random.nextInt(rect.height);
			
			repaint();
			try{
				Thread.sleep(100);
				
			}catch (Exception e) {
			e.getLocalizedMessage();}
		}
		
	}
	public static void main(String[] args) {
		GraphicThread gt = new GraphicThread(20000);
		Thread t = new Thread(gt);//new Thread(new GraphicThrea(20000));
		t.start();
	}

	@Override
	public void update(Graphics g) {
		// TODO Auto-generated method stub
		g.clipRect(x, y, 3, 3);//상자 크기지정
		paint(g);//그림안에 색칠
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillOval(x, y, 3, 3);
		
	}

}
