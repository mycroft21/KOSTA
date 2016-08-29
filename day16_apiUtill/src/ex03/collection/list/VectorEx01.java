package ex03.collection.list;

import java.util.Vector;

// 순서가 있고 , 중복을 허용하비가
public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector[] v = new Vector[3];
		v[0] = new Vector(); // 객체생성 메로리 학ㄹ달 ㅇ아
		v[1] = new Vector(5);
		v[2] = new Vector(5, 3);

		for (int i = 0; i < v.length; i++) {
			System.out.println("백텊" + i + "] = " + v[i].size());
			System.out.println("용량" + v[i].capacity());
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 12; j++) {
				v[i].addElement(new Integer(j));
			}
		}
			System.out.println();
			for (int i = 0; i < v.length; i++){
				System.out.println("백텊" + i + "] = " + v[i].size());
			System.out.println("용량" + v[i].capacity());}

		
	}

}
