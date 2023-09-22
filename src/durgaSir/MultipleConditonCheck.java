package durgaSir;

import java.util.function.Predicate;

public class MultipleConditonCheck {
public static void main(String[] args) {
	int[] x= {5,10,12,15,18,20,22};
	Predicate<Integer> predicate = x1-> x1%2==0;
	Predicate<Integer> predicate2= x2-> x2>14;
	
	System.out.println("the number are even and > 10");
	for(int l :x) {
		if(predicate.and(predicate2).test(l)) {
			System.out.println(l);
		}
	}
	
	
}
}
