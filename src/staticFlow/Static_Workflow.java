package staticFlow;

public class Static_Workflow {
	static int i = 10;
	static int j=20;
	int k=20;
	
	{
		method3();
		System.out.println("first instace block");
		System.out.println(k);
	}
	public void method3() {
		System.out.println("instace method");
	}
	static {
		System.out.println("first static block");
		method1();
		Static_Workflow static_Workflow = new Static_Workflow();
		static_Workflow.method3();
	}

	public static void main(String[] args) {
      method1();

      System.out.println("main method");
	}

	public static void method1() {
		System.out.println("method1");
		System.out.println(i);
	}
	
	public static void method2() {
		System.out.println("method2");
		System.out.println(j);
	}
	static {
		System.out.println("Second static block");
		method2();
	}
}
