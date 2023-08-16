package Stream;

import java.util.Arrays;
import java.util.List;

public class DuplicateElements {
public static void main(String[] args) {
	 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,10,8);
	 myList.stream().distinct().sorted().forEach(System.out::println);
}
}
