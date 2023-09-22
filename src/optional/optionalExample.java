package optional;

import java.util.Optional;

public class optionalExample {
public static void main(String[] args) {
	 String value = "ndfdkn";
	 
	 if(value== null) {
		 System.out.println("obj is null" + value);
	 }else {
		 System.out.println("obj value is :" +value);
	 }
	 //samething using optional class
	 
	 Optional<String> option= getName();
	 System.out.println(option.orElse("null Value"));
}

public static Optional<String> getName(){
	String name="Ramesh";
	
	return Optional.ofNullable(name);
			
}
}
