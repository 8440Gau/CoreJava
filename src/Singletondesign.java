
public class Singletondesign {
public static void main(String[] args) {
	
}
}

class SingletonObj{
	//static private varibale
	private static SingletonObj obj;
	//private constructor
	private SingletonObj() {}
	
	private  static SingletonObj refernce() {
		if(obj==null)
		obj = new SingletonObj();
		return obj;
	}
	
	
}
