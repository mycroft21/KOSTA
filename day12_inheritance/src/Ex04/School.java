package Ex04;

import java.util.Scanner;

public class School extends Sub {

	String[] school = new String[super.i], name  = new String[super.i] , major = new String[super.i], grade = new String[super.i];

	public School() {
		for(int j = 0; j < super.i; j++){
		System.out.println("�б�");
		school[j] = super.temp();
		System.out.println("�̸�");
		name[j] = super.temp();
		System.out.println("����");
		major[j] = super.temp();
		System.out.println("�г�");
		grade[j] = super.temp();}

	}

	
	public void show() {
		System.out.println("�б�\t�̸�\t����\t�г�\t�⼮");
		for(int j = 0; j < super.i; j++){
		System.out.println(school[j] + "\t" + name[j] + "\t" + major[j] + "\t" + grade[j]);}
	}

}