package inheritance;

 class C1 { 
	   int x = 50;
	}
	 class C2 extends C1 {
	   int x = 40;
	}
	public class Check {
	public static void main(String[] args) 
	{
	   C2 c2 = new C2();
	   System.out.println("Child :"+c2.x); 
	 
	   C1 c1 = new C1();
	   System.out.println("parent :"+ c1.x);
	 
	   C1 c3 = new C2();
	   System.out.println("Parent to child :"+c3.x);
}
	}