package designpattern;

public class Employee {
	private final String empid ;
	private final String empName;
	
	Employee(String id, String name){
		this.empid=id;
		this.empName= name;
	}
	
	public String getEmpDetails() {
		return "empid :" + empid +" "+"name :"+empName;
	}

}
