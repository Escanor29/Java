package methods;

public class Introduction {

	public static void main(String[] args) {
		
		int firstNumber = 34;
		int secondNumber = 23;
		int result = maxOf(firstNumber,secondNumber);
		System.out.println(result);
		
		for (int i = 0 ; i<5;i++)
		sayHi();
		
		maxOf(5);
		
	}
	 static int maxOf(int a , int b) {
		if(a>b) {
		return a;
	}else {
		return b;
	}
	}
	 
	 static int maxOf(float d) {                              // Method Overloading
		 return 0;
	 }
	 
	 static void sayHi() {
		 System.out.println("Hi");
		 System.out.println("Good Morning");
	 }
	 

		
	}


