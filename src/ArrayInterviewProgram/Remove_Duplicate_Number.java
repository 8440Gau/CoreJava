package ArrayInterviewProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class Remove_Duplicate_Number {
	public static void main(String[] args) {
		Remove_Duplicate_Number.UsingLindkedSet();
	}

	public static void UsingLindkedSet() {
		System.out.println("using linklist remove duplicate");
		int[] arr = { 2, 3, 4, 5, 2 };

		List<int[]> list = Arrays.asList(arr);

		Set<int[]> set = new HashSet<int[]>(list);
          
		set.forEach(a->System.out.println(a));

	}
}
