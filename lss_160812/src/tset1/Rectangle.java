package tset1;

public class Rectangle extends Shape {

/*	����1) 
	Rectangle Ŭ������ �����ڸ� �ϼ��ϼ���. 
	- ShapeTest Ŭ������ main �޼��忡�� Shape s1 = new Rectangle(4,5); ������ �����ϸ� �Ű�
	���� 4�� 5�� ���� width�� height ��������� �ʱ�ȭ�ϴ� �����ڸ� �����մϴ�.    */ 
	
	int width, height;
	
	private void Rectangle(int x, int y) {
		this.width = x;
		this.height = y;
		

	}
	
		
		
	/*
	����2) 
	Rectangle Ŭ������ area () �޼��带 �ϼ��ϼ���.  
	- ShapeTest Ŭ������ main �޼��忡�� s1.area () �޼��带 ȣ���ϸ� width*height �� ����Ͽ� 
	�簢���� �ʺ� ���ϴ� area () �޼��带 overriding �մϴ�.  */   
	
	double area(){
		
		
		return width*height;
	}

	
/*	����3) 
	Rectangle Ŭ������ circumference () �޼��带 �ϼ��ϼ���.  
	- ShapeTest Ŭ������ main �޼��忡�� s1. circumference () �޼��带 ȣ���ϸ� 
	2*(width+height) �� ����Ͽ� �簢���� �ѷ��� ���ϴ� circumference () �޼��带 overriding ��
	�ϴ�.
	*/
	
	@Override
	double circuference() {
		// TODO Auto-generated method stub
		return 2*(width+height);
	}
	
	
	

}
