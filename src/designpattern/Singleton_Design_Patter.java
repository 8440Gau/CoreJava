package designpattern;

public class Singleton_Design_Patter {
public static void main(String[] args) {
	Test test = new Test();
	System.out.println(test);
}
}


class Test {
	private static Test t = null;

	Test() {
	};

	public static Test test() {
		if (t == null)
			t = new Test();
		return t;
	}

}