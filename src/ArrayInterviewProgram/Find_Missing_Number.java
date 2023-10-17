package ArrayInterviewProgram;

public class Find_Missing_Number {
public static void main(String[] args) {
	System.out.println("Using Simple logic ");
	int arr[]= {1,3,4,6};
	int num = arr.length;
	System.out.println(arr.length);
	System.out.println("Missing Number is : "+ Find_Missing_Number.addArray(arr, num));
}

//using the algo

public static int addArray(int arr[], int num) {
	int sum = ((num+1)*(num+2))/2;
	for(int i=0;i<num;i++) {
       sum= sum-arr[i];
	}
	return sum;
}
}
