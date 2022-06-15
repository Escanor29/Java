package Q;
import java.util.Scanner;
public class quadratic {
public static void main(String[] args) {
	  Scanner sc = new Scanner(System.in);
	  System.out.println(" Enter your marks");
		System.out.print("Maths ");
		int Maths = sc.nextInt();
		System.out.print("Chemistry ");
		int Chemistry = sc.nextInt();
		System.out.print("Electronics ");
		int Electronics = sc.nextInt();
		System.out.print("Mechanical ");
		int Mechanical = sc.nextInt();
		System.out.print("CPS ");
		int CPS = sc.nextInt();
		System.out.print("ChemLab ");
		int ChemLab = sc.nextInt();
		System.out.print("CpsLab ");
		int CpsLab = sc.nextInt();
		System.out.print("English ");
		int English = sc.nextInt();

		System.out.print("SGPA ");
       System.out.println((4*g(Maths)+4*g(Chemistry)+3*g(Electronics)+3*g(Mechanical)+3*g(CPS)+g(ChemLab)+g(CpsLab)+g(English))/20);
 
 }
	static double g(int Marks) {
		if(90<=Marks && 100>Marks) {
	        return 10;
		} else if (80<=Marks && 90>Marks){
		    return 9;
		} else if (70<Marks && 80>Marks){
			return 8;
		} else if (60<=Marks && 70>Marks){
			return 7;
		} else if (50<=Marks && 60>Marks){
			return 6;
		} else if (40<=Marks && 50>Marks){
			return  5;
		} else if (30<=Marks && 40>Marks){
			return 4;
		} else if (20<=Marks && 30>Marks){
			return  3;
		} else if (10<=Marks && 20>Marks){
			return 2;
		} else if (0<=Marks && 10>Marks){
			return 1;
		}
		return Marks;	
	}
	}


