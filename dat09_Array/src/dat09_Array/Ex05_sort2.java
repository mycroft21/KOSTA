package dat09_Array;

import java.util.Scanner;

public class Ex05_sort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		int[][] grade = new int[7][6];
		String[][] name = new String[7][2];
		String object[] = {"�̸�","����","ü��","����","����","���","����","���"};

		for (int i = 0; i < name.length; i++) {
			System.out.println("�̸��� �Է��ϼ���!");
			name[i][0] = sc.next();
		}

		for (int i = 0; i < grade.length; i++) {

			System.out.println(name[i][0] + "�� ���� ������ �Է� �� �ּ���!");
			grade[i][0] = sc.nextInt();

			System.out.println(name[i][0] + "�� ü�� ������ �Է� �� �ּ���!");
			grade[i][1] = sc.nextInt();

			System.out.println(name[i][0] + "�� ���� ������ �Է� �� �ּ���!");
			grade[i][2] = sc.nextInt();

			grade[i][3] = grade[i][0] + grade[i][1] + grade[i][2];
			grade[i][4] = (grade[i][0] + grade[i][1] + grade[i][2]) / 3;
		}//���� �Էº�

		

		for (int i = 0; i < grade.length; i++) {
			int temp = 0;
			for (int j = 0; j < grade.length; j++) {
				if (grade[i][3] >= grade[j][3]) temp++;
			}
			grade[i][5] = 8 - temp;
			//��� ���ϱ� 
			
			switch (grade[i][3]/30) {
			case 10: case 9: name[i][1] = "A"; break;
			case 8: name[i][1] = "B"; break;
			case 7: name[i][1] = "C"; break;
			case 6: name[i][1] = "D"; break;
			default: name[i][1] = "F"; break;	
			}//���� ���ϱ�
		}
			
			for(int x = 0; x < name.length; x++){
				
				System.out.print(object[x]+"\t");}
			
			System.out.println("\n============================================================");
			
		for(int x = 0; x < name.length; x++){		
				System.out.print(name[x][0] + "\t" + grade[x][0] + "\t" + grade[x][1] + "\t" + grade[x][2] +"\t" +grade[x][3]+"\t"
									+ grade[x][4]+"\t" +name[x][1]+"\t" + grade[x][5]+"��\n");
				System.out.println("-------------------------------------------------------------");			
			
				
		}

	}// end m

}