package mapworking;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeesList {
	public static void main(String[] args) {
		List<Employee> employeesList = Arrays.asList(new Employee(1, "Alex", 100), new Employee(2, "Brian", 100),
				new Employee(3, "Charles", 200), new Employee(4, "David", 200), new Employee(5, "Edward", 300),
				new Employee(6, "Frank", 300));

		List<Double> distinctSalaries = employeesList.stream().map(e -> e.getSalary()).distinct()
				.collect(Collectors.toList());

		System.out.println(distinctSalaries);
	}
}

class Employee {
	private long id;
	private String name;
	private LocalDate dateOfBirth;
	private double salary;

	public Employee(final long id, final String name, final LocalDate dateOfBirth, final Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
		this.salary = salary;
	}

	public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	public long getId() {
		return id;
	}

	public void setId(final long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(final double salary) {
		this.salary = salary;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(final LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public int getAge() {
		return Period.between(LocalDate.now(), dateOfBirth).getYears();
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dateOfBirth=" + dateOfBirth + ", salary=" + salary + "]";
	}
}