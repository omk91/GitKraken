package main;

public class Main {

	public static void main(String[] args) {
		Person p = new Person("Person");
		Child c = new Child("Child");
		Doctor d = new Doctor();
		ChildDoctor cd = new ChildDoctor();
		
		System.out.println(cd);
		System.out.println("change form eclipse");
	}
}