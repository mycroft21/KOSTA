package trier;

import java.awt.*;

import javax.swing.*;

public class Jtable2 extends JFrame {

	JButton b1, b2, b3, b4, b5;
	JPanel p1, p2, p3;
	JPanel pa, pb, pc, pd;
	JLabel lb1, lb2, lb3, lb4;
	JTable jt;

	public Jtable2() {

		
		p3 = new JPanel();
		p1 = new JPanel();
		p2 = new JPanel();
		pa = new JPanel();
		pb = new JPanel();
		pc = new JPanel();
		pd = new JPanel();
		
		b1 = new JButton("전체보기");
		b2 = new JButton("추가");
		b3 = new JButton("삭제");
		b4 = new JButton("검색");
		b5 = new JButton("취소");

		p3.add(b1);
		p3.add(b2);
		p3.add(b3);
		p3.add(b4);
		p3.add(b5);

		lb1 = new JLabel("번호");
		lb2 = new JLabel("암호입력");
		lb3 = new JLabel("이메일");
		lb4 = new JLabel("전화번호");

		JTextField tf1 = new JTextField("번호", 10);
		JTextField tf2 = new JTextField("암호입력", 10);
		JTextField tf3 = new JTextField("이메일", 10);
		JTextField tf4 = new JTextField("전화번호", 10);

		p1.setLayout(new GridLayout(6, 1));
		pa.setLayout(new FlowLayout());
		pb.setLayout(new FlowLayout());
		pc.setLayout(new FlowLayout());
		pd.setLayout(new FlowLayout());

		
		pa.add(lb1);
		pa.add(tf1);
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
		
		jt = new JTable();
		JScrollPane sp = new JScrollPane(jt);
		getContentPane().add(sp);
		p2.add(jt);

		add("South", p3);

		add("West",p1);
		
		add("East", p2);

		pack();
		setVisible(true);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new Jtable2();
	}

}
