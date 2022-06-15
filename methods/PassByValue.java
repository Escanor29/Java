package methods;

public class PassByValue {

	public static void main(String[] args) {
		int c = 34;
		int d = 21;
		swap(c,d);
		System.out.println(c + "  " + d);  
		
		Dog e = new Dog();
		e.legs = 4;
		Dog f = new Dog();
		f.legs = 3;
		
		swap(e,f);  
		System.out.println(e.legs + "  " + f.legs); 

	}

	static void swap(int a, int b) {
		
	int temp = a;
	a = b;
	b = temp;
	}
	static void swap (Dog a , Dog b) {
		Dog temp = a;
		a = b;
		b = temp;
	}
}
  class Dog{
	  int legs;
  }
 
 