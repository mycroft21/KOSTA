package dat09_Array;

public class Selection_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 1, 50, 6, 80, 10, 9 };
		int temp = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					temp = arr[j + 1];
					arr[j + 1] = arr[j];
					arr[j] = temp;	//버블 정렬

					/*
					 * if (arr[i] > arr[j]) { temp = arr[i]; arr[i] = arr[j];
					 * arr[j] = temp;}
					 */// 선택정렬
				}
			}
		}

		for (int item : arr) {
			System.out.print(item + "\t");
		}

	}

}
