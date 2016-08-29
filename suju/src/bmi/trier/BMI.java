package bmi.trier;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;

public class BMI implements Serializable {

	protected Double hight = 0.0;
	protected Double weight = 0.0;
	protected Double result = 0.0;
	protected String you = null;

	public BMI input(BMI bmi) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("키를 입력하세요");
		this.hight = Double.parseDouble(br.readLine());
		System.out.println("몸무게를 입력하세요");
		this.weight = Double.parseDouble(br.readLine());

		this.result = this.weight / ((this.hight / 100) * (this.hight / 100));

		if (result > 25)
			this.you = "돼지";

		else if (result <= 25)
			this.you = "사람";
		/*
		 * al[0]=hight; al[1]=(weight); al[2]=(result); al[3]=(you);
		 * map.put(count,al);
		 */

		return bmi;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return hight + "\t" + weight + "\t" + result + "\t" + you;
	}

}
