package lists.vectorAndStacks;

import java.util.Stack;

public class MainClass {

	public static void main(String[] args) {
	
//		Vector<Integer> = new Vector();
		
//		V.add(34);
//		v.add(12);
		
		Stack<Integer> stack = new Stack();
		
		stack.push(12);
		stack.push(24);
		stack.push(36);
		
		int popped = stack.pop();
		int peeked = stack.peek();
		System.out.println(peeked);
		
		
		
	}

}
