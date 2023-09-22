package comparblevscompartor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import util.Employee_Utils_Global;

public class Sort {
public static void main(String[] args) {
	System.out.println("Hello");
	
	List<Integer> arr =  Arrays.asList(12,36,6);
	
	Collections.sort(arr);	
	
	List<Person> list = Arrays.asList(new Person(102640, "Gauurav", 42000.0f, 24),
			new Person(20387759, "Singh", 22500.0f, 21),
			new Person(132876, "Saurabh", 25098.0f, 26), new Person(887654, "Anand", 18000.0f, 19),
			new Person(108765, "Bicky", 32500.0f, 28));
	
	ArrayList<Person> list1= new ArrayList<Person >();
	
 
	
	
	list.stream().sorted(Comparator.comparing(Person::getEmpname)).
	
	forEach(a->System.out.println(a));
}
}
  class Person{
	  
	  long empid;
		String empname;
		float salary;
		int age;
		public long getEmpid() {
			return empid;
		}
		public void setEmpid(long empid) {
			this.empid = empid;
		}
		public String getEmpname() {
			return empname;
		}
		public void setEmpname(String empname) {
			this.empname = empname;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			return "Person [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", age=" + age + "]";
		}
		public Person(long empid, String empname, float salary, int age) {
			super();
			this.empid = empid;
			this.empname = empname;
			this.salary = salary;
			this.age = age;
		}
		
		
  }