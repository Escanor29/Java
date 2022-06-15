package loops;
import java.util.Scanner;
public class SeriesSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float n = sc.nextFloat();
		float sum = 0;
		for(float i = 1; i<=n ; i++) {
			sum += 1/ i;
			System.out.print(sum + " ");
		}

// add odd & sub even
		
		float a = sc.nextFloat();
		float s = 0;
		for(float i = 2; i<=a ; i++) {
			if(i%2!=0) {
				s+= 1/ i;
			}
			if(i%2==0) {
				s-=1/i;
			}
			
		}System.out.print(s);
		
	}

}
