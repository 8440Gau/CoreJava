package util;

import java.util.Arrays;
import java.util.List;

public class Employee_Utils_Global {
	public static void main(String[] args) {
		List<Employee_Utils> list = Arrays.asList(new Employee_Utils(102640, "Gauurav", 42000.0f, 24),
				new Employee_Utils(20387759, "Singh", 22500.0f, 21),
				new Employee_Utils(132876, "Saurabh", 25098.0f, 26), new Employee_Utils(887654, "Anand", 18000.0f, 19),
				new Employee_Utils(108765, "Bicky", 32500.0f, 28));

	}
}

class Employee_Utils {
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
		return "Employee [empid=" + empid + ", empname=" + empname + ", salary=" + salary + ", age=" + age + "]";
	}

	public Employee_Utils(long empid, String empname, float salary, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
	}

	public Employee_Utils() {

	}

}