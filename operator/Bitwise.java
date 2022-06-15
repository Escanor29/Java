package operator;

public class Bitwise {

	public static void main(String[] args) {
		int a = 10 ;
		int b = 13 ;
		int c = a&b;
		int d = a|b;
		System.out.println(c + "   "+ d);
	    
		int e = a>>5;
		int f = b<<2;
		System.out.println(e + "  "+ f );
	}
	

}
