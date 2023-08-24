package string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class EachCharCountOFString {
	public static void main(String[] args) {
		String str = "Communication";

		Map<String, Long> map = Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(count -> count, LinkedHashMap::new, Collectors.counting()));
		
		System.out.println(map);
	}
}
