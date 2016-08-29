package ex03.awt;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

import javax.swing.JFrame;

public class MainEnrty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame j = new JFrame();
		Frame f = new Frame("awt frame");
		f.setLayout(new BorderLayout());
		
		f.add(new Button("North"),BorderLayout.NORTH);
		f.add(new Button("South"),BorderLayout.SOUTH);
		f.add(new Button("East"),BorderLayout.EAST);
		f.add(new Button("West"),BorderLayout.WEST);
		f.add(new Button("Center"),BorderLayout.CENTER);
		
		f.setSize(400,200);//화면크기
		f.setVisible(true);//화면표시
		f.setLocation(400,550);//화면위치
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
