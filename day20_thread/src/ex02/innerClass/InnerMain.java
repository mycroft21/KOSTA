package ex02.innerClass;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*class EventHandler implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("12등급 이벤트가 발생하였습니다.");
	
	}
	
}*/

public class InnerMain {

	public static void main(String[] args) {
		Frame f = new Frame("이벤트 처리 = 이너클래스");
		Button btn = new Button("strat");
	
	/*	EventHandler handler = new EventHandler();
		btn.addActionListener(handler);*/
		
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				

				
				
			}
		});
		
		f.add(btn);
		
		f.setVisible(true);
		f.setSize(300, 200);
		f.setLocation(333, 222);

	}

}
