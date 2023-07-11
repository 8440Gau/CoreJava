package JVM;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Variable_Method_Info {
 public static void main(String[] args) {
	
	Student student = new Student();
	Class c= student.getClass();
	
	System.out.println(c.getName());
	System.out.println("****");
	
	Method[] method = c.getDeclaredMethods();
	for(int i=0; i< method.length; i++) {
		System.out.println(method[i]);
	}
	
	Field[] field = c.getFields();
	for(int i =0; i< field.length;i++) {
		System.out.println("***********");
		System.out.println(field[i]);
	}
	
}
}
class Student{
	int rollno;
	int student_name;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public int getStudent_name() {
		return student_name;
	}
	public void setStudent_name(int student_name) {
		this.student_name = student_name;
	}
	
	
}