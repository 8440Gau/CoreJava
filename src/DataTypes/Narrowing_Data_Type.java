package DataTypes;

/*
 * Narrowing simple mean we are converting bigger data_type into the smaller data_type. for example conversion
 * double data_type into the int data type
 */
public class Narrowing_Data_Type {
public static void main(String[] args) {
	double a=30;
	System.out.println("double_data_type " + a);
	int b =(int) a;
	System.out.println("int_data_type " + b);
}
}