package durgaSir;

import java.util.ArrayList;
import java.util.function.Predicate;

public class Predicate_CustomeClass {
public static void main(String[] args) {
	
	ArrayList<Employee> emp= new ArrayList<Employee>();
	
	emp.add(new Employee("A","1000"));
	emp.add(new Employee("b","900"));
	emp.add(new Employee("C","500"));
	emp.add(new Employee("D","100"));
	int a=500;
	Predicate<Employee> emp1 = e1-> Integer.parseInt(e1.getSalary())>500;
	for(Employee e: emp) {
		if(emp1.test(e)) {
			System.out.println(e);
		}
	}
	
	
	
}
}
 class Employee {
	 String name;
	 String Salary;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSalary() {
		return Salary;
	}
	public void setSalary(String salary) {
		Salary = salary;
	}
	public Employee(String name, String salary) {
		super();
		this.name = name;
		Salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", Salary=" + Salary + "]";
	}
	 
	 
 }