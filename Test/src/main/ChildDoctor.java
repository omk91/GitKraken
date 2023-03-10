package main;

public class ChildDoctor extends Doctor{

	public Person handle (Person p) {
		System.out.println(p.toString());
		return p;
	}
}
