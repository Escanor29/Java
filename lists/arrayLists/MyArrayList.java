package lists.arrayLists;

import java.util.ArrayList;

public class MyArrayList {

	public static void main(String[] args) {
//		ArrayList<String> fruits = new ArrayList<>();
//		fruits.add("Apple");
//		fruits.add("Banana");
//		System.out.println(fruits);
		
		Pair<String, Integer> p1 = new Pair("Keshav",29);
		Pair<Boolean,String> p2 = new Pair(true,"Hello");
		
		p1.getDescription();
		p2.getDescription();
	}

}
