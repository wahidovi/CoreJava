package java8.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class JavaStreamsExample2 {

	public static void main(String[] args) {

		Integer arr[] = { 2, 8, 9, 4, 16, 23, 7 };

		Stream.of(arr)
		.filter(x -> x % 2 == 0)
		.sorted()
		.forEach(x -> System.out.println(x));

		System.out.println("-----------------");
		
		List<Integer> list = Arrays.asList(1,8,2,4,11,56,12,14,9);
		
		list.stream()
		.sorted()
		.filter(n -> n%2 == 0)
		.forEach(System.out::println);
	}

}
