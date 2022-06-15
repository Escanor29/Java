package oops;

import oops.A.B;
import oops.A.C;
public class StaticKeyword {

	static {
		System.out.println("in block 1");
	}
	
	static {
		System.out.println("in block 2");
	}
	
	public static void main(String[] args) {
		
		System.out.println("inide main");
	}
	static {
		System.out.println("in block 3");
	}

}
