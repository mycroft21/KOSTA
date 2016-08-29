package ex1.map;

import java.util.Enumeration;
import java.util.Hashtable;

//map : key/value 한쌍으로 처리(set +list)

public class HashMapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("박정희", "123-444-3334");
		map.put("노태후", "123-434-3034");
		map.put("전두환", "123-444-3334");
		map.put("박정희", "123-414-3334");

		Enumeration enu = map.keys();
		while (enu.hasMoreElements()) {// enu 에 다음이 있다면
			String key = (String) enu.nextElement();
			String value = map.get(key);
			
			System.out.println(key + ":"+value);
		}

	}

}
