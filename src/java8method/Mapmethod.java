package java8method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Mapmethod {
 public static void main(String[] args) {
	List<Integer> list =  Arrays.asList(1,2,3,4,5,6);
	
	Function<Integer,Integer> function = new Function<Integer, Integer>() {

		@Override
		public Integer apply(Integer t) {
			
			return t*2;
		}
	};
	
	Stream s= list.stream();
	
	Stream s1= s.map(function);
	
	s1.forEach(System.out::println);
	
	
}
}
