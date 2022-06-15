package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
		
		Set<Integer> x = new HashSet<>();
		
		x.add(23);
		x.add(12);
		x.add(14);
	    
Set<Integer> y = new HashSet<>();
		
		y.add(23);
		y.add(16);
		y.add(17);
		
		
		x.retainAll(y);
		System.out.println(x);
	}

}
