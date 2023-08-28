package cloning;
/*
 * When we do a copy of some entity to create two or more than two entities such that changes in 
 * one entity are not reflected in the other entities, then we can say we have done a deep copy.
 *  In the deep copy, a new memory allocation happens for the other entities, 
 *  and reference is not copied to the other entities.
 *  Each entity has its own independent reference. The following example demonstrates the same.
 */
public class DeepCloning {
public static void main(String[] args) {
	// creating an object of the class ABC  
	ABC obj1 = new ABC();  
	  
	// it will copy the reference, not value  
	ABC obj2 = new ABC();  
	  
	// updating the value to 6   
	// using the reference variable obj2  
	obj2.x = 6;  
	  
	// printing the value of x using reference variable obj1   
	System.out.println("The value of x is for obj1.x: " + obj1.x);  
	System.out.println("The value of x is for obj2.x: " + obj2.x);  
	}  

}
class ABC{
	int x=30;
}