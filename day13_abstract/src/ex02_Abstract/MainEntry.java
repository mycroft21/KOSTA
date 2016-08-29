package ex02_Abstract;

class Point{
	int x, y ;
	
	Point(){this(10,10);}
	Point(int x){
		this(x,90); y = 9;
		System.out.println("point call");
	}
	Point(int x, int y){
		this.x = x ; this.y = y;
		
	}

	public void display() {
		// TODO Auto-generated method stub
		System.out.println("pint x ="+x+", y = "+y);
	}

}



public class MainEntry {
public static void main(String[] args) {
	new Point().display();
	new Point(7).display();
	new Point(2,3).display();
}
}
