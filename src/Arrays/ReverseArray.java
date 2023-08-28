package Arrays;

public class ReverseArray {
public static void main(String[] args) {
	ReverseArray array = new ReverseArray();
	int originalarr[]= {10,20,30,40};
	int arr[]= {1,6,9,3,5,4};
	array.reverseMethodM1(originalarr, originalarr.length);
	array.maxvalue(originalarr);
	int temp;
	   //Sort the array in ascending order    
    for (int i = 0; i < arr.length; i++) {     
        for (int j = i+1; j < arr.length; j++) {     
           if(arr[i] > arr[j]) {    
               temp = arr[i];    
               arr[i] = arr[j];    
               arr[j] = temp;    
           }     
        }     
    }    
    System.out.println("***********************************");    
    
    //Displaying elements of array after sorting    
    System.out.println("Elements of array sorted in ascending order: ");    
    for (int i = 0; i < arr.length; i++) {     
        System.out.print(arr[i] + " ");    
    }    
}

public void reverseMethodM1(int arr[], int numberofElemementinArray ) {
	int j=numberofElemementinArray;
	int arr2[] = new int[numberofElemementinArray];
	
	for(int i=0;i<arr.length;i++) {
		arr2[j-1]= arr[i];
		j=j-1;
	}
	System.out.println("Reverse Array result");
	for(int k=0;k<numberofElemementinArray;k++){
		System.out.println(arr2[k]);
	}
}

public int maxvalue(int arr[]) {
	int max= arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println("max: "+max);
	return max;
	
}
}
