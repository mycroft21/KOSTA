package montecarlo;

public class PureNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 2�̻� 1000���� �ڿ����� ���տ��� �Ҽ��� ������ ���ϴ� �˰������� �ۼ��Ͻÿ�.

		boolean[] pure = new boolean[999];
		int count = 0;

		for (int i = 2; i <= 1000; i++) {

			for (double j = 2; j < i; j++) {

				if (i % j == 0) {
					pure[i - 2] = true;
				}

			}

			if (pure[i - 2] == false) {
				count++;
				System.out.print(i + "\t");
			}

			if (i % 100 == 0)
				System.out.println();

		}

		System.out.println("�Ҽ��� ���� : " + (count));
System.out.println(((5*22)+(6*8))/30);
	}

} 