package day08_array;

public class Ex02_Array {

	public static void main(String[] args) {
		int[] arr = new int[5];
		arr[0] = 1;
		for(int i = 1; i < arr.length; i++){
			arr[i] = arr[i-1] + 1;
			System.out.println(arr[i]);
		}
		int[] arr2 = { 1,2,3,4,5,6};
		System.out.println(arr2[1]);
	}
}
