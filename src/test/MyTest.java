package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MyTest {
public static void main(String[] args) {
	List<Integer> list = new ArrayList<Integer>();
	list.add(11);
	list.add(21);
	list.add(3);
	list.add(49);
	list.add(23);
	
	System.out.println(list.stream().distinct().max((c,b)->c.compareTo(b)).get());
	System.out.println("****************8");
	list.stream().map(a->a+"").filter(p->p.startsWith("2")).forEach(System.out::println);
	
	System.out.println("**********************************");
	list.stream().sorted(Comparator.reverseOrder()).forEach(a->System.out.println(a));
}
}
