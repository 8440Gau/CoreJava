package predefiendmethods;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OddEven {
public static void main(String[] args) {
	 
	List<Integer> list = List.of(10,11,20,89,77,23,22);
	
	 list.stream().filter(p->p%2==0 && p>10).collect(Collectors.toList()).forEach(System.out::println);
	 
	 Stream<Integer> stream ;
	 
}
}
