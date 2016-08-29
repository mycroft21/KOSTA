package ex02.collection.set;

import java.util.HashSet;
import java.util.Set;

// Set 순서없고 중복 허용하지 않음
public class HashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object[] objArr = { "1", new Integer(1), "2", "3", "3", "4", "4", "4" };

		Set set = new HashSet();

		for (int i = 0; i < objArr.length; i++) {
			set.add(objArr[i]);
		}

		System.out.println(set); //중복 데이터 저장 안함 but 데이터 타입이 다르면 저장가능

	}

}
