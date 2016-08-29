package Ex04;

import java.util.Scanner;

public class School extends Sub {

	String[] school = new String[super.i], name  = new String[super.i] , major = new String[super.i], grade = new String[super.i];

	public School() {
		for(int j = 0; j < super.i; j++){
		System.out.println("학교");
		school[j] = super.temp();
		System.out.println("이름");
		name[j] = super.temp();
		System.out.println("전공");
		major[j] = super.temp();
		System.out.println("학년");
		grade[j] = super.temp();}

	}

	
	public void show() {
		System.out.println("학교\t이름\t전공\t학년\t출석");
		for(int j = 0; j < super.i; j++){
		System.out.println(school[j] + "\t" + name[j] + "\t" + major[j] + "\t" + grade[j]);}
	}

}
