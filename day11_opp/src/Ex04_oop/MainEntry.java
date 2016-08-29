package Ex04_oop;

public class MainEntry {
public static void main(String[] args) {
	
	Point pt = new Point();
	Circle cc = new Circle(7,6,4);
	Rect re = new Rect();
	
	pt.disp();
	cc.disp();
	
	re.setX(11);
	re.disp();
	
	
	pt.setX(7);
	
	for(int i = 0; i < pt.getX(); i++){
		System.out.print("*\t");
	}
	System.out.println();
	for(int i = 0; i< pt.getY();i++){
		System.out.printf("*\t");
		for(int j = 0; j < pt.getZ()-2; j++){
			System.out.print("\t");
		}System.out.println("*");
		
	
	}
	for(int i = 0; i < pt.getX(); i++){
		System.out.print("*\t");
	}
	
}

}
