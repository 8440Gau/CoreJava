package Stream;

public class Anonymous {
public static void main(String[] args) {
	MyInterface m1= new MyInterface() {
//using the anonymous class
		@Override
		public void SayMethod() {
			System.out.println("Say Hello");
			
		}
		
	};
	
	MyInterface m2 = new MyInterface() {
		
		@Override
		public void SayMethod() {
			System.out.println("Say How you doing");
			
		}
	};
	m2.SayMethod();
	m1.SayMethod();
	
	//same thing using lambha expression using functional interface
	
	MyInterface m3=()-> System.out.println("I am lambha boys");
	m3.SayMethod();
}
}

interface MyInterface{
	public  abstract void SayMethod();
}