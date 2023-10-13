package array;

import java.util.Arrays;

public class SortingArrary {
	public static void main(String[] args) {
		SortingArrary arrary = new SortingArrary();
		System.out.println("Using Predefined method");
		arrary.ArraySorting();
		System.out.println("Using custom method");
		arrary.customSorting();
	}

	public void ArraySorting() {
		 int[] arr1 = { 5, -2, 23, 7, 87, -42, 509 };

		Arrays.sort(arr1);
		for (int num : arr1) {
			System.out.println(num);
		}
	}
	
	public void customSorting() {
		 int[] arr1 = { 5, -2, 23, 7, 87, -42, 509 };
		
		 int temp;
		 for(int i=0; i<arr1.length;i++) {
			 for(int j=i+1;j<arr1.length;j++) {
				 if(arr1[i]>arr1[j]) {
					temp=arr1[i];
					arr1[i]=arr1[j];
					arr1[j]=temp;
				 }
				 
			 }
			 System.out.println(arr1[i]);
		 }
		
	}
}
