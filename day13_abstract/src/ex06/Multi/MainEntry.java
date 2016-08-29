package ex06.Multi;

import ex02_Abstract.Shape;

public class MainEntry {
public static void main(String[] args) {
	MultiClass mc = new MultiClass();
	mc.display();
	mc.draw();
	mc.show("»ç¶ûÇØ");
	System.out.println(mc.num);
	System.out.println(mc.str);
	
	
	Test t = new MultiClass();
	t.display();
	
	Shape s = new MultiClass();
	s.calc(29.1);
	s.show("Çù¼ÒÇØ");
	s.view();
	
	
	
}
}
