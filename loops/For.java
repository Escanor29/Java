package loops;
import java.util.Scanner; 
public class For {

	public static void main(String[] args) {
	 for(int i=1;i<=20;i++) {
		 System.out.print(" shipu " + i);
	 }

// sum of n terms
	 
	 Scanner sc = new Scanner(System.in);
	 int n = sc.nextInt();
	 int sum =0;
	 for (int i = 1 ; i <=n ;i++) {
		 sum = sum + i;
	 }
	 System.out.print(sum + " ");
	 
	 
// table
	 
	 int a =sc.nextInt();
	 for(int i = 1;i<=10;i++) {
		 System.out.print(a*i + " ");
	 }
	 
	 
// factorial
	 
	 int x = sc.nextInt();
	 for(int i = x-1;i>=1;i--) {
		x=x*i; 
	 }
	 System.out.println(x);
	}


	
}
