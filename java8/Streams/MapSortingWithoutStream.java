package java8.Streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class MapSortingWithoutStream {
	public static void main(String[] args) {

		Map<String, Integer> cityZip = new HashMap<>();

		cityZip.put("Tracy", 95377);
		cityZip.put("Hayward", 94544);
		cityZip.put("San Jose", 95121);
		

		System.out.println(cityZip);

		List<Entry<String, Integer>> entries = new ArrayList<>(cityZip.entrySet());

		Collections.sort(entries, new Comparator<Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {
				
				
				
				return o1.getValue().compareTo(o2.getValue());
			}

		});
		
		System.out.println(entries);
		
		
		
	}
}
