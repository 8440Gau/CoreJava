package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateElements {
public static void main(String[] args) {
	 List<Integer> myList = Arrays.asList(10,15,8,49,25,98,98,32,15,10,8);
	 myList.stream().distinct().sorted().forEach(System.out::println);
	 
	 Set<Integer> set = new LinkedHashSet<Integer>();
	 System.out.println("****************");
	 myList.stream().filter(p->!set.add(p)).forEach(System.out::print);
}
}
