package ArrayInterviewProgram;

import java.util.Arrays;

public class Shift_Array_Position {
public static void main(String[] args) {
int[] originalArray= {2,3,5,4,8,9,1,7};
//modify array arr[]= {8,9,1,7,2,3,5};

System.out.println(Arrays.toString(shiftposition(originalArray, 4)));

}

public static int[] shiftposition(int[] originalArray, int position ) {
	int resultarray[] = new int[originalArray.length];
	for(int i=0;i<resultarray.length;i++) {
		if(originalArray.length+i-position<originalArray.length)
			resultarray[i]= originalArray[originalArray.length+i-position];
		else
			resultarray[i]= originalArray[i-position];
	}
	return resultarray;
}
}
