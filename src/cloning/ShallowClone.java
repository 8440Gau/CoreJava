package cloning;
/*
 * When we do a copy of some entity to create two or more than two entities such that changes 
 * in one entity are reflected in the other entities as well, then we can say we have done a shallow copy.
 *  In shallow copy, new memory allocation never happens for the other entities, 
 *  and the only reference is copied to the other entities.
 *  The following example demonstrates the same.
 */
public class ShallowClone {
public static void main(String[] args) {
	Obj oj= new Obj();
	System.out.println(oj.x);
	oj= new Obj();
	System.out.println(oj.x);
	
	
}
}

class Obj{
	int x=30;
}