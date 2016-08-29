package ex02.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetEx3 {

	public static void main(String[] args) {

		Set set = new HashSet();

		set.add(new String("happy"));
		set.add(new String("korea"));
		set.add(new Person("David",10));
		set.add(new Person("David",10));
		set.add(new Person("doywen",20));

		System.out.println(set);
	}

}

class Person {
	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj instanceof Person){
			Person temp = (Person)obj;
			return name.equals(temp.name) && age == temp.age;
		}
		return super.equals(obj);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return name.hashCode() + age;
	}
	
	
}
