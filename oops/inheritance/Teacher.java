package oops.inheritance;

public class Teacher extends Person {

	public Teacher(String name) {
		
	super(name);
	System.out.println("inside Teacher constructor");
	}
	
public void teach() {
	System.out.println(name + " is teaching");
}
	public void  walk() {
		System.out.println("teacher " + name + " is walking");
	}
			
	public void eat() {
		super.eat();
		System.out.println("teacher " + name + " is eating");
	}
}


