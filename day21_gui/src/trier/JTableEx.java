package trier;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.JTextField;

public class JTableEx extends JTable {

	JTable jt;
	JPanel jp1, jp2, jp3, jp4;
	JPanel p1, p2, p3, p4;

	public JTableEx(String title) {
		super();

		jp1 = new JPanel(new FlowLayout());
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();

		JButton b1 = new JButton("��ü����");
		JButton b2 = new JButton("�߰�");
		JButton b3 = new JButton("����");
		JButton b4 = new JButton("�˻�");
		JButton b5 = new JButton("���");

		JLabel lb1 = new JLabel("��ȣ");
		JLabel lb2 = new JLabel("��ȣ�Է�");
		JLabel lb3 = new JLabel("�̸���");
		JLabel lb4 = new JLabel("��ȭ��ȣ");

		JTextField tf1 = new JTextField("��ȣ", 10);
		JTextField tf2 = new JTextField("��ȣ�Է�", 10);
		JTextField tf3 = new JTextField("�̸���", 10);
		JTextField tf4 = new JTextField("��ȭ��ȣ", 10);

		p1 = new JPanel(new FlowLayout());
		p2 = new JPanel(new FlowLayout());
		p3 = new JPanel(new FlowLayout());
		p4 = new JPanel(new FlowLayout());

		p1.add(lb1);
		p1.add(tf1);
		p2.add(lb2);
		p1.add(tf2);
		p3.add(lb3);
		p1.add(tf3);
		p4.add(lb4);
		p1.add(tf4);
		jp1.add(p1);
		jp1.add(p2);
		jp1.add(p3);
		jp1.add(p4);

		jp2.add(b1);
		jp2.add(b2);
		jp2.add(b3);
		jp2.add(b4);
		jp2.add(b5);

		add("South", jp3);

		add("West", jp1);
		/*
		 * add("West", pb); add("West", pc); add("West", pd);
		 */

		add("East", jp2);

		setVisible(true);
		setBounds(100, 200, 300, 300);
	}

	public static void main(String[] args) {
		new JTableEx("title");
	}

}