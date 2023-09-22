package functionInterfacedurgaSir;

import java.util.function.Function;

public class StringLenthUsingFunction {
public static void main(String[] args) {
	Function<String, Integer> fun = string->string.length();
	System.out.println(fun.apply("Counttheoccurance"));
}
}
