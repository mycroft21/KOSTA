package ex1.map;

import java.util.Enumeration;
import java.util.Hashtable;

//map : key/value �ѽ����� ó��(set +list)

public class HashMapeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String, String> map = new Hashtable<String, String>();
		map.put("������", "123-444-3334");
		map.put("������", "123-434-3034");
		map.put("����ȯ", "123-444-3334");
		map.put("������", "123-414-3334");

		Enumeration enu = map.keys();
		while (enu.hasMoreElements()) {// enu �� ������ �ִٸ�
			String key = (String) enu.nextElement();
			String value = map.get(key);
			
			System.out.println(key + ":"+value);
		}

	}

}
