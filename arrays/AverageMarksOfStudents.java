package arrays;
import java.util.Scanner;
public class AverageMarksOfStudents {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter total no. of students ");
		int n = sc.nextInt();
 
        int marks[] = new int[n];
		for(int i = 0 ; i < n ; i++) {
	
		  marks[i]=sc.nextInt();
		}

		int	average = 0;
			for(int i = 0 ; i < n ; i++) {
		
				average += marks[i];
			    
			}
			average=average/n;
			
            System.out.println(average);  
	}

}
