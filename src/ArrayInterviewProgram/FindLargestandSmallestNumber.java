package ArrayInterviewProgram;

public class FindLargestandSmallestNumber {
public static void main(String[] args) {
	FindLargestandSmallestNumber.largeandSmallest();
}
public static void largeandSmallest() {
	int[] arr= {1,5,3,5,9};
	int max=0,min=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]>arr[j]) 
				System.out.println("max : "+ arr[i]);
				else if (arr[i]<arr[j]) 
				System.out.println("min : "+arr[i] );
			
		}
	}
}
}
