package Ec02;

import java.util.Scanner;

public class Emp {
	String name, subjet, hp;
	int level, classes;
	Scanner sc = new Scanner(System.in);

	public Emp() {

	}

	public Emp(String name, String subjet, String classes, String hp) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Scanner getSc() {
		return sc;
	}

	public void setSc(Scanner sc) {
		this.sc = sc;
	}

	public String getSubjet() {
		return subjet;
	}

	public void setSubjet(String subjet) {
		this.subjet = subjet;
	}

	public int getClasses() {
		return classes;
	}

	public void setClasses(int classes) {
		this.classes = classes;
	}

	public String getHp() {
		return hp;
	}

	public void setHp(String hp) {
		this.hp = hp;
	}
	public void input() {
		System.out.println("이름을 입력 하세요");
		this.name = sc.next();
		System.out.println("부서를 입력하세요");
		this.subjet = sc.next();
		System.out.println("직급을 입력하세요 1부터4까지");
		this.classes = sc.nextInt();
		System.out.println("연락처를 입력하세요");
		this.hp = sc.next();
		System.out.println("이름" + "\t"+ "부서" + "\t"+ "직급" + "\t"+ "연락처");
		System.out.println(name + "\t"+ subjet + "\t"+ classes + "\t"+ hp);
		
		
}}
