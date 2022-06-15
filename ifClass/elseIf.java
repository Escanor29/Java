package ifClass;

import java.util.Scanner;

public class elseIf {

	public static void main(String[] args) {
	    int i,N;
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(i = 0;i<T;i++){
            N = sc.nextInt();
            if(N%3==0){
                if(N%5==0){
                   System.out.println("Fork Java"); 
                }else{
                    System.out.println("Fork");
                }
                
            }else if (N%5==0){
                if(N%3!=0){
                    System.out.println("Java");
                }
                
            } else{
                    System.out.println("");
                }
        
        }   

	}

}
