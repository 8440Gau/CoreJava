package ArrayInterviewProgram;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class Find_Duplicate_Number {
public static void main(String[] args) {
	int arr[]= {2,7,5,4,2};
	Find_Duplicate_Number.findingDuplicate(arr);
	Find_Duplicate_Number.findDuplicate();
}
public static int findingDuplicate(int[] arr) {
	int result=0;
	for(int i=0;i<arr.length;i++) {
		for (int j=0;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				result = arr[i];
			
		}
	}
	
}
	System.out.println(result);
	return result;
}

public static void findDuplicate() {
	System.out.println("Using Java 8");
	List<Integer> list= Arrays.asList(1,2,4,5,6,23,2,9,8,2,9);
	Set<Integer> Set= new TreeSet<Integer>();
	
	list.stream().filter(p-> !Set.add(p)).collect(Collectors.toList()).forEach(a->System.out.println(a));
			
}
}