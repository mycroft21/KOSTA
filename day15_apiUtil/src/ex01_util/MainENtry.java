package ex01_util;

import java.util.Date;
import java.util.Calendar;

public class MainENtry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calendar c = Calendar.getInstance();//system�̰������ִ� ��¥�� geto
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)+1);//0���� ����
		System.out.println(c.get(Calendar.DATE));
		System.out.println("===============");
		
		System.out.println(c.get(Calendar.MINUTE));
		
	
	

	
	Calendar c1 = Calendar.getInstance();
	Calendar c2 = Calendar.getInstance();
	c2.set(2016, 12, 20, 0, 0);
	if(c1.after(c2)){
		System.out.println("����ð��� "+ c1.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		
	}else if (c1.equals(c2)){
		System.out.println("����");
	}else if(c1.before(c2)){System.out.println("����ð��� �޷�");}

}}
