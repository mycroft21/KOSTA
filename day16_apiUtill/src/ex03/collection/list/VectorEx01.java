package ex03.collection.list;

import java.util.Vector;

// ������ �ְ� , �ߺ��� ����Ϻ�
public class VectorEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector[] v = new Vector[3];
		v[0] = new Vector(); // ��ü���� �޷θ� �Ф��� ����
		v[1] = new Vector(5);
		v[2] = new Vector(5, 3);

		for (int i = 0; i < v.length; i++) {
			System.out.println("�鶇" + i + "] = " + v[i].size());
			System.out.println("�뷮" + v[i].capacity());
		}

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 12; j++) {
				v[i].addElement(new Integer(j));
			}
		}
			System.out.println();
			for (int i = 0; i < v.length; i++){
				System.out.println("�鶇" + i + "] = " + v[i].size());
			System.out.println("�뷮" + v[i].capacity());}

		
	}

}
