package inheritance;

public class BloodRelation {
public static void main(String[] args) {
	Grandpa grandpa = new Dad();
	grandpa.show();
}
}
class Grandpa { 
    public void show() 
    { 
        System.out.println( 
            "Inside show() method of Grandpa class"); 
    } 
} 
class Dad extends Grandpa { 
    
    // Overriding show method of Grandpa class 
    @Override public void show() 
    { 
        System.out.println( 
            "Inside show() method of Dad class"); 
    } 
} 
