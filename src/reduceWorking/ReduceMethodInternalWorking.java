package reduceWorking;

import java.util.Arrays;

/*
 * In Java 8, the Stream.reduce() combine elements of a stream and produces a single value.

The reducing operation takes three parameters:

identity: Like the Stream.reduce operation, the identity element is both the initial value of the reduction 
and the default result if there are no elements in the stream. In this example, the identity element is 0; 
this is the initial value of the sum of ages and the default value if no members exist.

mapper: The reducing operation applies this mapper function to all stream elements. 
In this example, the mapper retrieves the age of each member.

operation: The operation function is used to reduce the mapped values. 
In this example, the operation function adds Integer values.

T reduce(T identity, BinaryOperator<T> accumulator);

IntStream.java

int reduce(int identity, IntBinaryOperator op);

LongStream.java

long reduce(int identity, LongBinaryOperator op);

identity = default or initial value.

BinaryOperator = functional interface, take two values and produces a new value.

 */
public class ReduceMethodInternalWorking {
public static void main(String[] args) {
	//A simple sum operation using a for loop.
	  int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	  int sum = 0;
	  for (int i : numbers) {
	      sum += i;
	  }

	  System.out.println("sum : " + sum); // 55
	  

//The equivalent in Stream.reduce()

  int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
  // 1st argument, init value = 0
  int sum1 = Arrays.stream(number).reduce(0, (a, b) -> a + b);
  System.out.println("sum : " + sum); // 55
	  
  //or method reference with Integer::sum
  int sum2= Arrays.stream(numbers).reduce(0, Integer::sum); // 55
	  System.out.println("Sum2: "+ sum2);
	  
	
}
}
