package trier;

import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Goo2 extends Frame implements ActionListener {

	Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
	TextArea ta;
	Label lb;
	Panel p, p2;

	public Goo2(String title) {

		super(title);

		lb = new Label("버튼을 눌러주세요");

		b1 = new Button("종료");
		b2 = new Button("2단");
		b3 = new Button("3단");
		b4 = new Button("4단");
		b5 = new Button("5단");
		b6 = new Button("6단");
		b7 = new Button("7단");
		b8 = new Button("8단");
		b9 = new Button("9단");

		

		ta = new TextArea("구구단을 출력합니다.", 10, 50, TextArea.SCROLLBARS_VERTICAL_ONLY);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);

		p = new Panel();
		p2 = new Panel();

		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);

		p2.add(ta);
		
		add("Center", p2);
		add("North", p);
		setBounds(300, 200, 400, 300);
		setVisible(true);
		setBackground(Color.BLACK);

		System.out.println("여기까지 .....");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Goo2("구구단");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int temp = 0;
		Object obj = e.getSource();
		if ((Button) obj == b1) {
			System.exit(0);
		} else if ((Button) obj == b2) {
			temp = 2;

		} else if ((Button) obj == b3) {
			temp = 3;
		} else if ((Button) obj == b4) {
			temp = 4;
		} else if ((Button) obj == b5) {
			temp = 5;
		} else if ((Button) obj == b6) {
			temp = 6;
		} else if ((Button) obj == b7) {
			temp = 7;
		} else if ((Button) obj == b8) {
			temp = 8;
		} else if ((Button) obj == b9) {
			temp = 9;
		}
		for (int i = 1; i < 10; i++) {
			ta.append("\n" + temp + " x " + i + " = " + temp * i);
		}
		System.out.println(e.getActionCommand());

	}

}
