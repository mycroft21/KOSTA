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
			System.out.println("월");break;
			case TUES:
			System.out.println("화");break;
			case WEDNES:
			System.out.println("수");break;
			case THURS:
				System.out.println("목");break;
			case FRI:
				System.out.println("금");break;
				
		}//end
			
			
			Day day = Day.MON;
			
			if(Day.MON == day){
				System.out.println("월요일 입니다.");
			}
			
	}

}
