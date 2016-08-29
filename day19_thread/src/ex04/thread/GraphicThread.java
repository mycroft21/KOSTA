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
	
	
	public GraphicThread(int num) {//�������Լ�= �ʱ�ȭ

		this.num = num;
		color = Color.cyan;
		random = new Random();
		
		setSize(500,400);//������ ũ�� = �ʺ�,����
		setVisible(true);//ȭ�� ǥ��
		setLocation(750, 300);//��ġ����
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�ݱ�
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
		g.clipRect(x, y, 3, 3);//���� ũ������
		paint(g);//�׸��ȿ� ��ĥ
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(color);
		g.fillOval(x, y, 3, 3);
		
	}

}
