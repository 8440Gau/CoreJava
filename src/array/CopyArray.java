package array;

public class CopyArray {
	public static void main(String[] args) {
		CopyArray array = new CopyArray();
		System.out.println(" using predefiend method of java ");
		array.copyarray();
		System.out.println("using basic logic of java ");
		array.basicarraycopy();
	}

//using predefiend method of java 
	public void copyarray() {
		String[] copyFrom = { "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado", "Doppio", "Espresso",
				"Frappucino", "Freddo", "Lungo", "Macchiato", "Marocchino", "Ristretto" };

		System.out.println(copyFrom[0]);
		String[] copyTo = new String[12];

		System.arraycopy(copyFrom, 0, copyTo, 3, 9);

		for (String i : copyTo) {
			System.out.println(i);
		}
	}

//using simple logic of java 
	public void basicarraycopy() {
		int arr[] = { 1, 2, 3, 4, 5 };
		int[] arr2= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr2[i]= arr[i];
		}
		for(int j=0;j<arr2.length;j++) {
			System.out.println(arr2[j]);
		}

	}

}
