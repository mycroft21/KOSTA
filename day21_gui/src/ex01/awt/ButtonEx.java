package ex01.awt;

import java.awt.*;

public class ButtonEx extends Frame{

	Button btn1,btn2,btn3,btn4,btn5;
	
	public ButtonEx(String str) {//��ư default ��ġ�� �߾� ����̴�.
		super(str);
		setLayout(new FlowLayout());
		btn1 = new Button("1��");
		btn2 = new Button("2��");
		btn3 = new Button("3��");
		btn4 = new Button("4��");
		btn5 = new Button("5��");
		
		this.add(btn1);//this = ButtonEx ������ ����
		add(btn2);
		add(btn3);
		add(btn4);
		add(btn5);
		
		setSize(400, 300);
		setVisible(true);
	}
	
	
	
	public static void main(String[] args) {
	
		new ButtonEx("��ư����");
		
		
		
	}	
}
