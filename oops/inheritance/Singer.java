package oops.inheritance;

public class Singer extends Person{
public Singer(String name) {
		super(name);
		
	}
public void sing() {
	
	System.out.println(name + " is singing");
	}
	public void walk() {
		System.out.println("Singer " + name + " is walking");
	}
			
	public void eat() {
		System.out.println("Singer " + name + " is eating");
	}
	
}

	 

