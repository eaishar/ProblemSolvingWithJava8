package sample;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Sorting a hashmap by key and value
 * 
 * @author eaishar
 *
 */
public class SortHashMapByKeyAndValue {

	public static void main(String[] args) {
		HashMap<Integer, String> data = new HashMap<>();
		data.put(1, "Vin");
		data.put(4, "Aish");
		data.put(6, "Laksh");
		data.put(2, "Karpi");
		System.out.println(data);
		Map<Integer, String> sortedAscByKey = data.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("AscByKey" + sortedAscByKey);

		Map<Integer, String> sortedDescByKey = data.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("DescByKey" + sortedDescByKey);

		Map<Integer, String> sortedAscByValue = data.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("AscByValue" + sortedAscByValue);

		Map<Integer, String> sortedDescByValue = data.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println("DescByValue" + sortedDescByValue);
	}

}
