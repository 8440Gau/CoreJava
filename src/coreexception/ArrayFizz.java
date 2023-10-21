package coreexception;

public class ArrayFizz {
public static void main(String[] args) {
	int[] arr= {2,5,10,9,7,12,15,20};
	
	for(int i=0; i<arr.length;i++) {
		if(i%3==0) {
			System.out.println("Fizz :" + arr[i]);
		}else if(i%5==0) {
			System.out.println("buzz :"+ arr[i]);
		}else if(i%3==0 && i%5==0) {
			System.out.println("fizzbuzz :"+ arr[i]);
		}else {
			System.out.println("no num is divided");
		}
	}
}
}
