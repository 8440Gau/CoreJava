package inheritance;

public class InherExample1 {
public static void main(String[] args) {
	
	Parent parent = new Parent();
	//parent.master();

	Parent parent2 = new Child();
	parent2.master();
	parent2.m();

    Child child = new Child();
    //child.master();
   // child.m();
}
}
class Parent{
	public void master() {
		System.out.println("Parent");
	}
	public void m() {
		System.out.println("Parent method");
	}
}

class Child extends Parent{
	public void master() {
		System.out.println("Child");
	}
	public void main() {
		System.out.println("Child m2");
	}
}
