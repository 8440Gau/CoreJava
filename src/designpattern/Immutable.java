package designpattern;

/*
 * The class must be declared as final so that child classes can’t be created.
 * 
Data members in the class must be declared private so that direct access is not allowed.

Data members in the class must be declared as final so that we can’t change the value of it after object creation.

A parameterized constructor should initialize all the fields performing a deep copy so that data members 
can’t be modified with an object reference.

Deep Copy of objects should be performed in the getter methods to return a copy rather 
than returning the actual object reference)
 */
public class Immutable {
	public static void main(String[] args) {
		Employee employee = new Employee("abc123", "Gaurav");
		String s= employee.getEmpDetails();
		System.out.println(s);
		Employee employee2 = new Employee("ab23", "Puja");
		String s2= employee2.getEmpDetails();
		System.out.println(s2);
	}

}
