package functionInterfacedurgaSir;

import java.util.function.Function;

public class FunctionBasic {
public static void main(String[] args) {
	/*
	 * interface Function <T,R>
	 * {
	 *  public R apply(T t)
	 *  }
	 *  
	 */
	
	Function<Integer, Integer> fun = a1-> a1*a1;
	System.out.println(fun.apply(5));
	
}
}
