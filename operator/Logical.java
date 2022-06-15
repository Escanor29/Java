package operator;

public class Logical {

	public static void main(String[] args) {
	int no = 25;
	if (no>=1 && no <=100) {                           
		// logical operator plays with logics 
		System.out.println("no is in range btw 1 & 100 "); 
	}
	
	if (no>=1 & no <=100) {
		// bitwise operator plays with bits
		System.out.println("no is in range btw 1 & 100 ");
	}
	
	int a= 11;
     if (!(a ==10 || a==12)) {
    	 System.out.println("u can give board exam now ");
     }
	}

}
