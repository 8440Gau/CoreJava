package functionalInterfaceTypes;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * Functional Interface are 4 types.we are going to create code for all the 4 types.
 * 1. Predicate<T>: This functional interface will return boolean true or false
 */
public class FunctionalInterfaceType {

	public static void main(String[] args) {
		
//Predicate functional interface 
		//:We will create a string and check its length if greater than 5 return true else false
		
		Predicate<String> predicate = Stringlenght -> Stringlenght.length()>5;
		System.out.println(predicate.test("abdfdc"));
		
//Consumer<T> funtional interface Method :accept(T t)
//it will modify the data of original object
		
		Consumer_Person consumer_Person = new Consumer_Person();
		Consumer<Consumer_Person> consumer = con->con.setName("Singh");
		consumer.accept(consumer_Person);
		System.out.println(consumer_Person.getName());
		
		
}
}

class Consumer_Person{
	String name ="Gaurav";

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}