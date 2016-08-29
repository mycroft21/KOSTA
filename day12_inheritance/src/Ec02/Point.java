package Ec02;

public class Point {
protected int x,y;

public Point(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Point(int x) {
	super();
	this.x = x;
	this.y = y;
}
public Point() {
	System.out.println("Point");
	
	// TODO Auto-generated constructor stub
}

public int getX() {
	return x;
}

public void setX(int x) {
	this.x = x;
}

public int getY() {
	return y;
}

public void setY(int y) {
	this.y = y;
}
protected void display() {
	// TODO Auto-generated method stub
System.out.println(x+ ",\t" +y);
}

}


