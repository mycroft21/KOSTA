package Eex01.staticMember;

enum Day{
	MON, TUES, WEDNES, THURS, FRI;
	
	
	
}

public class EnumerationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Day dd;
		Day d = Day.valueOf(args[0]);
		System.out.println(d);
			switch(d){
			case MON:
			System.out.println("��");break;
			case TUES:
			System.out.println("ȭ");break;
			case WEDNES:
			System.out.println("��");break;
			case THURS:
				System.out.println("��");break;
			case FRI:
				System.out.println("��");break;
				
		}//end
			
			
			Day day = Day.MON;
			
			if(Day.MON == day){
				System.out.println("������ �Դϴ�.");
			}
			
	}

}
