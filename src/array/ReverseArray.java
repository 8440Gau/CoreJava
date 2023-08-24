package array;

public class ReverseArray {
public static void main(String[] args) {
	 int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	 ReverseArray.reverse(numbers, numbers.length);
}
public static void reverse(int arr[], int n) {
	int arr2[] = new int[n];
	int j=n;
	for(int i=0;i<n;i++) {
		arr2[j-1]=arr[i];
		j=j-1;
	}
	//reverse array
	System.out.println("Reversed Array");
	for(int k=0;k<n;k++) {
		System.out.println(arr2[k]);
	}
}
}
