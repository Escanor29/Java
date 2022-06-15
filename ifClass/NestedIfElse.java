package ifClass;
import java.util.Scanner ;
public class NestedIfElse {
//USERNAME & PASSWORD
	
	public static void main(String[] args) {
		System.out.print("ENTER USERNAME = ");
		Scanner keyboard = new Scanner(System.in);
		 String USERNAME = keyboard.next();
	     
		if(USERNAME.equals("KESHAV")) {
			System.out.print("ENTER PASSWORD = ");
			String PASSWORD = keyboard.next();
			if(PASSWORD.equals("CSE")) {
				System.out.print(" U R IN");
		                               }
			else {
				System.out.print("INCORRECT PASSWORD");
			     }
			                          } 
		else if(USERNAME.equals("SATABDEE")) {
			System.out.print("ENTER PASSWORD = ");
			String PASSWORD = keyboard.next();
			if(PASSWORD.equals("BUBLU")) {
				System.out.print(" U R IN");
		                               }
			else {
				System.out.print("INCORRECT PASSWORD");
			     }
			                          } 
		     else{
				System.out.print("INVALID USERNAME");
				 }
       }
         

// Which no. is greatest 
	
	       Scanner sc = new Scanner(System.in);
	       int a = sc.nextInt();
	       int b = sc.nextInt();
	       int c = sc.nextInt();{
	  if(a>b) {
		  if(a>c) {
			  System.out.println(a+" is greatest");
		  }else {
			  System.out.println(c+" is greatest");
		  }}
	else{
			  if(b>c) {
					  System.out.println(b+" is greatest");
				  }else {
					  System.out.println(c+" is greatest");
				  }	  
		 
	}}}




