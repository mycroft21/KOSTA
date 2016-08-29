package buffer;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class VesterQ2 {
	static int i = 0 ;
	static Vector <String> n = new Vector < String >();
	static Vector <Integer> h = new Vector < Integer >();
	static Vector <Integer> w = new Vector < Integer >();
	static Vector <String> b = new Vector < String>();
	
	public static void main(String[] args) {
		int[] numcon;  //����
		
		while(true){
			System.out.println("1. �߰�  2. ����  3.���  4. ����");
			Scanner sc = new Scanner(System.in);
			int Menu = sc.nextInt();
			
			switch(Menu) {
				case 1 :  //�߰��ϴ� �Լ�
					input();
					break;				
				case 2 : // �����ϴ� �Լ�
					System.out.println("������ ��ȣ : ");
					int delnum = sc.nextInt();
					delete(delnum);
					break;
				case 3 :  // ����ϴ� �Լ�
					display();
					break; 			
				case 4 :  System.exit(0);
				
				}//end switch
		}//end while

	} //end main
		
		public static void display(){
			if(i > 0){
				System.out.println( "[ȸ���� �� " +i + " ��]");
				System.out.println(" ��ȣ\t�̸�\t\tŰ\t\t������\t����  ");
				System.out.println( "-----------------------------------------------------");
				
				Iterator it = n.iterator(); Iterator it2 = h.iterator(); 
				Iterator it3 = w.iterator(); Iterator it4 = b.iterator();
			
				int nn = 0;
				while(it.hasNext()){  // ���� ��Ұ� �ִٸ�....
						System.out.println(nn++ +"\t"+ it.next() + "\t" + it2.next() + "cm\t" + it3.next()+"kg\t\t" + it4.next());
				}
			}
			else System.out.println("�Էµ� ȸ���� �����ϴ�.");
			System.out.println( "-----------------------------------------------------");
		}//display end

		public static void input(){
	
			
			Scanner sc = new Scanner(System.in);
				
			System.out.print("�̸� : ");
			String name = sc.next();
			n.add(name);
			System.out.print("Ű : ");
			int height = sc.nextInt();
			h.add(height);
			
			System.out.print("������ : ");
			int weight = sc.nextInt();
			w.add(weight);
			
			double BMI = weight/((height/100.0)*(height/100.0));

			if(BMI < 18.5) b.add("��ü��");
			else if(BMI >= 18.5 && BMI <23)	b.add("����ü��");
			else if(BMI >= 23 && BMI <25)	b.add("��ü��");
			else if(BMI >= 25 && BMI <30)	b.add("�浵��");
			else if(BMI >= 30 && BMI <35)	b.add("�ߵ���");
			else b.add("����");
			i++;
			
			//System.out.println(n.get(0));
		}
		
		public static void delete(int ii){
			n.remove(ii); h.remove(ii); w.remove(ii);
			--i;
		}
		
		/*public static void delete(){
			
			n.remove(); h.remove(); w.remove();
			--i;
		}*/
}