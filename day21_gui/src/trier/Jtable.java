package trier;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

import javax.swing.BoxLayout;

public class Jtable extends Frame {

	Button b1, b2, b3, b4, b5;
	Panel p1, p2, p3;
	Panel pa,pb,pc,pd;
	Label lb1,lb2,lb3,lb4;
	
public Jtable() {
	
	p1 = new Panel();
	p2 = new Panel();
	p3 = new Panel();
	pa = new Panel();
	pb = new Panel();
	pc = new Panel();
	pd = new Panel();
	
	
	
	b1 = new Button("��ü����");
	b2 = new Button("�߰�");
	b3 = new Button("����");
	b4 = new Button("�˻�");
	b5 = new Button("���");
	
	p3.add(b1);
	p3.add(b2);
	p3.add(b3);
	p3.add(b4);
	p3.add(b5);
	
	lb1 = new Label("��ȣ");
	lb2 = new Label("��ȣ�Է�");
	lb3 = new Label("�̸���");
	lb4 = new Label("��ȭ��ȣ");

	TextField tf1 = new TextField("��ȣ", 10);
	TextField tf2 = new TextField("��ȣ�Է�",10);
	TextField tf3 = new TextField("�̸���",10);
	TextField tf4 = new TextField("��ȭ��ȣ",10);
	
	p1.setLayout(new GridLayout(4, 1, 3, 3));
	pa.setLayout(new FlowLayout(2));
	pb.setLayout(new FlowLayout());
	pc.setLayout(new FlowLayout(2));
	pd.setLayout(new FlowLayout(2));
	
	pa.add("West",lb1);
	pa.add("East",tf1);
	pb.add(lb2);
	pb.add(tf2);
	pc.add(lb3);
	pc.add(tf3);
	pd.add(lb4);
	pd.add(tf4);
	
	p1.add(pa);
	p1.add(pb);
	p1.add(pc);
	p1.add(pd);
	
	
	add("South",p3);
	add("West",p1);
	add("East",p2);
	
	
	
	setVisible(true);
	pack();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	JFrame f = new JFrame("�ּҷ�");
		JButtonEx panel = new JButtonEx();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(panel);
		f.setSize(panel.getPreferredSize());
		f.setVisible(true);*/
	
		new Jtable();
	}

}
