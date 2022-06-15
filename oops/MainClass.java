package oops;


class cat {
	boolean hasFur;
	String colour,breed ;
	int legs,eyes;
	
	public void walk() {
		System.out.println("Cat is walking");
	}
	public void eat() {
		System.out.println("Cat is eating");
	}
	
	public void description() {
		System.out.println("My cat has "+ legs + " legs & " + eyes + " eyes.");
	}
	
}

class dog {
	
	String breed, name;
	
	public void jump() {
		System.out.println("my dog "+ name +" jumped.");
	}
		public void description() {
	System.out.println("my dog's name is "+ name + " & breed is "+ breed);
		}
		
	}
	

public class MainClass {

	public static void main(String[] args) {
      
		cat cat1 = new cat();
		cat cat2 = new cat();
		
		cat1.walk();
		cat2.eat(); 
	
		cat1.legs = 3;
		cat1.eyes = 2;
		
		cat2.legs = 4;
		cat2.eyes = 1;
		
		cat1.description();
		cat2.description();
		
		
		dog husky = new dog();
		dog poodle = new dog();
		
		husky.breed = "Husky";
		husky.name = "Browny";
		
		poodle.breed = "Poodle";
		poodle.name = "Jack";
		
		husky.jump();
		husky.description();
		
		poodle.jump();
		poodle.description();
		
	}

}
