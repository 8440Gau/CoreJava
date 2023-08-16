package Stream;

import java.util.List;
import java.util.stream.Stream;

public class StreamObject {
public static void main(String[] args) {
	//Stream API -collection process //group of project
	
	//1 blank 
	Stream<Object> emptystream = Stream.empty();
	
	//2-array, object , collection
	String name[] = {"Gaurav","Singh", "Saurabh", "Kappor"};
	
	Stream<String> stringobj = Stream.of(name);
	stringobj.forEach(e->System.out.println(e));
	
}
}
