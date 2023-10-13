package array;

public class SumofArray {
public static void main(String[] args) {
	 int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
	
	 int sum=0;
	 
	 for(int i=0;i<numbers.length;i++) {
		 sum =sum+i;
	 }
	 System.out.println(sum);
}
}
