package inheritance;

public class Check2 {
public static void main(String[] args) {
	A a = new A(10);
	System.out.println(a.toString());
}
}
class A{
	A(int i){
		
	}
}

class b extends A{
	b(){
		super(10);
	}
}