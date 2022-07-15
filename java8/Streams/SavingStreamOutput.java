package java8.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SavingStreamOutput {

	public static void main(String[] args) {
		
		List<String> cities = new ArrayList<>();
		
		cities.add("Hayward");
		cities.add("San Jose");
		cities.add("Oakland");
		cities.add("Fremont");
		
		List<String> sortedCities = cities.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedCities);
	}
}
