package maps;
import java.util.*;
public class MainClass {

	public static void main(String[] args) {
		
		Map<String,Integer> numbers = new HashMap<>();

		numbers.put("one", 1);
		numbers.put("two", 2);
		numbers.put("five",5 );
		
		numbers.putIfAbsent ("one",10);
		
		System.out.println(numbers.get("one"));
		
	}

}
