package operator;

public class Arithmetic {

	public static void main(String[] args) {
		int a = 7 ;
		int b = 8 ;
		int c = (a+b)*(a+b) ;
		int d = a*a + b*b + 2*a*b ;
		System.out.println(c +  "  " + d);
		
		double e = b/a;
		double f = (double)b/(double)a;
        System.out.println(e + "  " + f);
        
        int g =b%a;
        int h =a%b;
        System.out.println(g+" "+ h);
        
       int i = a++;
        int j = ++a;
        System.out.println(a + " "+ i + " " + j);
	}

}
