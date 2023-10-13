package Stream;

import java.util.Arrays;

public class StringFilterArraysWords {
public static void main(String[] args) {
	
	String[] str= {"Apple","Cat", "Dog", "Dolphin"};
	
	Arrays.stream(str).map(String:: toLowerCase).filter(p->!p.contains("a")).forEach(a->System.out.println(a));
}
}
