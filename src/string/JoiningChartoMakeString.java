package string;

import java.util.Arrays;
import java.util.List;

public class JoiningChartoMakeString {
public static void main(String[] args) {
	System.out.println("Using Custom and Basic Logic");
	JoiningChartoMakeString chartoMakeString = new JoiningChartoMakeString();
	JoiningChartoMakeString.Customlogic();
}

//custom method 
public static void Customlogic() {
	List<String> str = Arrays.asList("A","B","C" );
	//expexted output -> ABC
	String s = null ;
	for(int i=0;i<str.size();i++) {
	s= String.join(","+ i);
	
	}
	System.out.println(s);
	
}
}
