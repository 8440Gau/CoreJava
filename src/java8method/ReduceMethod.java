package java8method;

import java.util.Arrays;
import java.util.List;

public class ReduceMethod {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(1,2,3,4,5,6);
	
	int sum=0;
	
	for(int i: list) {
		sum= sum+i;
				
	}
	System.out.println(sum);
	
	int s= list.stream().reduce(0,(a,b)->a+b);
	System.out.println(s);
}
}
