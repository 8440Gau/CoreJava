package JVM;

public class HelloWorld {
public static void main(String[] args) {
	WorkLearn learn = new WorkLearn();
	learn.callmeAnytime();
	System.out.println("Hello Java");
}
}


class WorkLearn{
	public static void callmeAnytime() {
		System.out.println("I am fucking Ranger");
	}
}