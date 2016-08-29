package dat09_Array;

import java.util.Arrays;

public class Ex01_Araay {
public static void main(String[] args) {
	// TODO Auto-generated method stub

/*	int[][] x  = {{1,2,3},{4,5,6}};
	
	for(int i=0; i < x.length; i++){
		
		for(int j = 0; j < x[0].length; j ++){
			System.out.println(x[i][j]);
		}
	}
	//*/
	
	int[][] x = new int[2][3];
	
	for(int i =0; i < x.length; i ++){
		for(int j = 0; j < x[0].length; j++){
			x[i][j]=(j+i)*2;
			System.out.print(x[i][j]+"\t");
		}
		System.out.println();
	}
	
	
	
	for(int i =0; i < x.length; i ++){
		for(int j = 0; j < x[0].length; j++){
			
			System.out.println(x[i][j]);		
		}
	}
	
	
	
}
}
