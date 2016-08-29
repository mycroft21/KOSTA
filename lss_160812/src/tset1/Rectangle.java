package tset1;

public class Rectangle extends Shape {

/*	문제1) 
	Rectangle 클래스의 생성자를 완성하세요. 
	- ShapeTest 클래스의 main 메서드에서 Shape s1 = new Rectangle(4,5); 문장을 실행하면 매개
	변수 4와 5를 각각 width와 height 멤버변수로 초기화하는 생성자를 정의합니다.    */ 
	
	int width, height;
	
	private void Rectangle(int x, int y) {
		this.width = x;
		this.height = y;
		

	}
	
		
		
	/*
	문제2) 
	Rectangle 클래스의 area () 메서드를 완성하세요.  
	- ShapeTest 클래스의 main 메서드에서 s1.area () 메서드를 호출하면 width*height 를 계산하여 
	사각형의 너비를 구하는 area () 메서드를 overriding 합니다.  */   
	
	double area(){
		
		
		return width*height;
	}

	
/*	문제3) 
	Rectangle 클래스의 circumference () 메서드를 완성하세요.  
	- ShapeTest 클래스의 main 메서드에서 s1. circumference () 메서드를 호출하면 
	2*(width+height) 를 계산하여 사각형의 둘레를 구하는 circumference () 메서드를 overriding 합
	니다.
	*/
	
	@Override
	double circuference() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	
	
	

}
