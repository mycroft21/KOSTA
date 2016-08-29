package trier;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class ButtonEx extends Frame implements ActionListener {
	Label lb;
	Button b1,b2;
	public ButtonEx(String str){
		super(str);
		lb = new Label("push that butto");
		b1 = new Button("이상선");
		b2 = new Button("KOSTA");
		b1.addActionListener(this);
		b2.addActionListener(this);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		add("North", p);
		add("West",lb);
		setBounds(500, 400, 100, 100);
		setVisible(true);
		
	}
	
		
	
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Object obj = e.getSource();
		System.out.println(e.getActionCommand());
		if((Button)obj == b1){
			lb.setText("내이름이다");
		}else{
			lb.setText("코스타다");
		}
		
	}




	public static void main(String[] args) {
		new ButtonEx("사랑을 보여줘");
		
	}

}
