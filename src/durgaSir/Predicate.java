package durgaSir;

public class Predicate {
public static void main(String[] args) {

	java.util.function.Predicate<Integer> predicate = num->num%2==0;
	
	System.out.println(predicate.test(10));
	System.out.println(predicate.test(15));
	
}
}
