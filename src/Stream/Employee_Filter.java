package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Employee_Filter {
public static void main(String[] args) {
	
	List<Employee> list = Arrays.asList(
			new Employee(102640,"Gauurav",42000.0f, 24),
			new Employee(20387759,"Singh",22500.0f, 21),
			new Employee(132876,"Saurabh",25098.0f, 26),
			new Employee(887654,"Anand",18000.0f, 19),
			new Employee(108765,"Bicky",32500.0f, 28)
			);
	
	Map<Long, String> m= list.stream().filter(s-> s.age>22 && s.salary>25000).
	collect(Collectors.toMap(emp-> emp.empid, emp->emp.empname));
	
	m.entrySet().stream().forEach(e-> System.out.println(e));

	
}
}

class Employee{
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
	public Employee(long empid, String empname, float salary, int age) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.salary = salary;
		this.age = age;
	}
	
	
	public Employee() {
		
	}
	
}