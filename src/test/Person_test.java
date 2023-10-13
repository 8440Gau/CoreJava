package test;

public class Person_test {
public static void main(String[] args) {
	
	Person_test person_test =  new Person_test();
	String a= person_test.name("gaurav", "singh");
	System.out.println(a);
	
}

public String name(String firstname, String lastname) {
	return firstname+" "+lastname;
	
}
}
