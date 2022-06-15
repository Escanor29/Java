package introduction;
import java.util.Scanner;
public class Testing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
         long a = sc.nextInt();
         int b = sc.nextInt();
         int c = sc.nextInt();
         long l;
  if (a>b) {
	  if(a>c) {
		 l=a;
		 System.out.print(l+" is greatest"); 
		 }
		  else {l=b ;
		  System.out.println("c is greatest");
	  }}
	  else {if (c>b) {l=c;
	  System.out.println("c is greatest");}
	  else {l=b;
	  System.out.println("b is greatest");
	  
	  }
  }
	}

}
