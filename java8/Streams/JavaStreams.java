package java8.Streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class JavaStreams {
	public static void main(String[] args) {
		
		Integer[] values = new Integer[] {2,24,1,58,1,47};
		
		Stream<Integer> streamValues = Arrays.stream(values);
		
		streamValues
		.sorted()
		.forEach(x-> System.out.println(x));
		
		Stream<String> cities = Stream.of("Hayward", "Oakland", "San Jose",
										"Dublin", "Milpitas", "Tracy",
										"Gilroy", "Livermore", "Carmel",
										"Big Sur", "Union City", "Santa Clara");
		
		cities
		.filter(x -> x.startsWith("S"))
		.sorted()
		.forEach(x->System.out.println(x));
	}
}
