package com.demo.javacollections.eg;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortMapByValuesExample {

	public static void main(String[] args) {
		
		Map<String, Integer> unsortedMap = new LinkedHashMap<>();
		
		unsortedMap.put("A", 50);
		unsortedMap.put("B", 40);
		unsortedMap.put("C", 70);
		unsortedMap.put("D", 60);
		unsortedMap.put("E", 10);
		
		Map<String, Integer> sortedMap =
		unsortedMap.entrySet().stream().sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,
		e2) -> e1, LinkedHashMap::new));
		
		System.out.println("Sorted Map by Values: " + sortedMap);
	}
}
