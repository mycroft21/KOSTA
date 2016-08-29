package day08_array;

import java.util.Arrays;

public class Ex05_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] x = {7,32,7,9,12,7};
		int seek = 7, cnt =0;
		
		for(int i = 0; i<x.length; i++){
		if(seek == x[i]) cnt++;
		}
		System.out.println(cnt);
		Arrays.sort(x);
		for(int item: x){
			System.out.println(item + "  ");
		}
		for(int i = x.length-1; i >=0; i--){
			System.out.println(x[i]);
		}
	}

}
