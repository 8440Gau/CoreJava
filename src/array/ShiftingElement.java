package array;

import java.util.Arrays;

public class ShiftingElement {
public static void main(String[] args) {
	int[] arr = {2,4,6,8,2};
	int[] position = positionshift(arr,2); 
	System.out.println(Arrays.toString(position));
	
}

public static int[] positionshift(int arr[] , int position) {
	
	int[] result = new int[arr.length];
	for(int i =0;i<result.length;i++) {
		if(arr.length-position+i<arr.length) 
			result[i]= arr[arr.length-position+i];
		else 
			result[i]= arr[i-position];
	}
	return result;
	
}
}
