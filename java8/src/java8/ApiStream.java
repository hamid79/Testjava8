package java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ApiStream {

	public static <T> void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
//		// prints all numbers
//		for (Integer i : numbers) {
//			System.out.println(i);
//		}
//		
//		System.out.println("external loop");
//		for (int i = 0; i < numbers.size(); i++) {
//			System.out.println(numbers.get(i));
//		}
		
		System.out.println("internal loop foreach");
		numbers.forEach((i)-> System.out.println(i));

		System.out.println("internal loop foreach with stream");
		numbers.stream().forEach((i)-> System.out.println(i));
		
		System.out.println("i.intValue() > 5");
		numbers.stream().filter((i) -> i.intValue() > 5).forEach((i)-> System.out.println(i));;
		//System.out.println("count : "+strIn.toArray());
	}

}
