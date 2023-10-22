package instanceworkflow;

class Child extends Parent {
	int i = 100;
	{
		methodTwo();
		System.out.println("Child first instance block");
	}

	Child() {
		System.out.println("Child class constructor");
	}

	public static void main(String[] args) {
		Child c = new Child();
		System.out.println("Child class main method");
	}

	public void methodTwo() {
		System.out.println(j);
	}

	{
		System.out.println("Child second instance block");
	}
	int j = 200;
}

class Parent {
	int x = 10;
	{
		methodOne();
		System.out.println("Parent first instance block");
	}

	Parent() {
		System.out.println("parent class constructor");
	}

	public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println("parent class main method");
	}

	public void methodOne() {
		System.out.println(y);
	}

	int y = 20;
}