package Arrays;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/*
 * Given an array arr[] of integers. Find a peak element i.e. an element that is not smaller than its neighbors. 
 */
public class Peek_Problem {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5};
	int b[] = {4,5,6,7,8,9};
	
	 Arrays.stream(a).filter(i->Arrays.stream(b).anyMatch(i2->i2==i)).boxed().collect(Collectors.toList()).forEach(w->System.out.println(w));;
}
}
