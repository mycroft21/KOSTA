package ex02.innerClass;


class OuterClass{
	static int no;
	String message = "hi~~~";
	
	class InnerClass{
		//static int num=0;//���ο��� ������ƽ �Ұ�
		int su = 999;
		public void show(){
			System.out.println(su);//���λ�� ����
			System.out.println(message);//�ܺ� ��� ����
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
