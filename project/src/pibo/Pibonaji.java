package pibo;

import java.util.ArrayList;

public class Pibonaji {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		;
		ArrayList<Long> al = new ArrayList<>();

		al.add((long) 1);
		al.add((long) 1);
		
		for (int i = 0; i < 100; i++) {

			al.add(al.get(i+1) + al.get(i));
			
			if (i % 5 == 0) {
				System.out.println(i+1+"\t"+al.get(i));
			}
		}
		System.out.println(al.get(99));

		
			      long[] a = {0,1,1};
			      for(int i=3;i<=100;i++){
			      if(i%3==0){a[0]=a[1]+a[2];}
			      else if(i%3==1){a[1]=a[2]+a[0];}
			      else{a[2]=a[0]+a[1];}
			      }
			      System.out.println(a[1]);
			   }
			
	}

