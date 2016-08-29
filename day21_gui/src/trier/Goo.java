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

public class Goo extends Frame implements ActionListener{
	
	Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9;
	TextArea ta;
	Label lb;
	Panel p, p2 ;

	public Goo(String title)  {
		
		super(title);
		
		lb = new Label("버튼을 눌러주세요");
		
		btn1= new Button("2단");
		btn2= new Button("3단");
		btn3= new Button("4단");
		btn4= new Button("5단");
		btn5= new Button("6단");
		btn6= new Button("7단");
		btn7= new Button("8단");
		btn8= new Button("9단");
		btn9= new Button("종료");
		
		p = new Panel();		
		p2 = new Panel();
		
		ta = new TextArea("구구단을 출력합니다.",5,30,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		
		
		
		
		p.add(btn1);
		p.add(btn2);
		p.add(btn3);
		p.add(btn4);
		p.add(btn5);
		p.add(btn6);
		p.add(btn7);
		p.add(btn8);
		p.add(btn9);
		p2.add(ta);
		
		//add(btn1);add(btn2);add(btn3);add(btn4);add(btn5);add(btn6);add(btn7);add(btn8);add(btn9);
		
		add("West", p2);
		add("North",p);
		
		setBounds(300, 200, 300, 500);
		setVisible(true);
		setBackground(Color.BLACK);
		

		System.out.println("여기까지 .....");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Goo("구구단");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if ((Button) obj == btn1) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n2 X " + i + " = " + (2 * i));
			}
		} else if ((Button) obj == btn2) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n3 X " + i + " = " + (3 * i));
			}
		} else if ((Button) obj == btn3) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n4 X " + i + " = " + (4 * i));
			}
		} else if ((Button) obj == btn4) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n5 X " + i + " = " + (5 * i));
			}
		} else if ((Button) obj == btn5) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n6 X " + i + " = " + (6 * i));
			}
		} else if ((Button) obj == btn6) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n7 X " + i + " = " + (7 * i));
			}
		} else if ((Button) obj == btn7) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n8 X " + i + " = " + (8 * i));
			}
		} else if ((Button) obj == btn8) {
			for (int i = 1; i < 10; i++) {
				ta.append("\n9 X " + i + " = " + (9 * i));
			}
		} else {
			System.exit(0);
		}

	}

}
