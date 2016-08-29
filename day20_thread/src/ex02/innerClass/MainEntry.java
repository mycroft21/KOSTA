package ex02.innerClass;


class OuterClass{
	static int no;
	String message = "hi~~~";
	
	class InnerClass{
		//static int num=0;//내부에선 스테이틱 불가
		int su = 999;
		public void show(){
			System.out.println(su);//내부사용 가능
			System.out.println(message);//외부 사용 가능
		}
	}
	
}
public class MainEntry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OuterClass oc = new OuterClass();
		OuterClass.InnerClass ic = oc.new InnerClass();
		ic.show();
		OuterClass.InnerClass oic = new OuterClass().new InnerClass();
		oic.show();
	}

}
