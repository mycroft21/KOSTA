package ex01.awt;

import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.TextArea;

public class FrameMain extends Frame {

	TextArea ta;
	
	public FrameMain(String str) throws HeadlessException {

		super(str);
		setVisible(true);
		setBounds(350, 200, 400, 300);
		/*pack();*///자기 사이즈에 맞게 나온다.		
		/*setSize(300, 300);//화면 크기*/
		ta = new TextArea("문장을 넣으세요", 5,30, TextArea.SCROLLBARS_VERTICAL_ONLY);
		this.add(ta);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameMain("새창띄우기");
	}

}
