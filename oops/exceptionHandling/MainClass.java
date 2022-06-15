package oops.exceptionHandling;

public class MainClass {

	public static void main(String[] args) {
     
//		try {
//	
//		
//		int a=5;
//		int b=0;
//		int c=a/b;
//		System.out.println(c);
//		}catch(ArithmeticException e) {
//			System.out.println(e.getMessage()+" occured , please check ur code.");
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("index should be in the range of 0 to size of array.");
//		}catch(IllegalArgumentException e) {
//			System.out.println("check ur casting carefully");
//		}finally {
//			System.out.println("Sorry for the inconvenience");
//		}
//		
//		System.out.println("Iron Man");
//		
//		
		fun1();
	}

	static void fun1(){

		int a=5;
		int b=3;
		int c=a/b;
		System.out.println(c);
//try {
//		fun2();
//}catch(Exception e) {
//	System.out.println(e.getMessage()+" occured");
//}

		try {
			Thread.sleep(3000);
		}catch(InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("KCR");
}
	
	static void fun2() throws ArrayIndexOutOfBoundsException {
		
		boolean isDanger = true ;
		if(isDanger) {
			throw new ArrayIndexOutOfBoundsException(" Danger was coming");
		}		
	}
	
}
