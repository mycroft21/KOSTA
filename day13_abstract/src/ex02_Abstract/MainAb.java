package ex02_Abstract;

public class MainAb {
public static void main(String[] args) {
	new Circle().show("다람쥐");
	
	Shape sp = new Circle();//상속받은 자식으로는 생성이 가능하다우
	sp.show("돼지");
	
	Reat r = new Reat();
	r.show("사자");
	
	Tri t = new Tri();
	t.show("닭");

	System.out.println("========================================각자의 클래스");
	Shape s = new Circle();//다형성 하나의 이름으로 다돼, 부모의 추상 클래스를 이용해 객체 형성
	
	s.show("참치");
	s = new Reat();
	s.show("상어");
	s= new Tri();
	s.show("고래");
	
	System.out.println("\nqoduf------------------------------------배령\n");
	Shape[] sh = new Shape[3];
	sh[1] = new Reat();
	sh[2] = new Tri();
	sh[0] = new Circle();
	
	for(int i = 0; i < 3; i++){
		sh[i].show(i+"번째");
	}
	
}
}
