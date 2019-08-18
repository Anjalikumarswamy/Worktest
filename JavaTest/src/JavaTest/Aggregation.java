package JavaTest;

import java.util.ArrayList;
import java.util.List;

public class Aggregation {

	public static void main(String[] args) {
		Student s1 = new Student("Anji", 1, "CSE");
		Student s2 = new Student("Anj", 2, "EE");
		Student s3 = new Student("Anjiii", 3, "EE");
		Student s4 = new Student("Anjii", 4, "CSE");
		
		List <Student> cse_students = new ArrayList<Student>();
		cse_students.add(s1);
		cse_students.add(s4);
         
		List <Student> ee_students = new ArrayList<Student>();
		ee_students.add(s2);
		ee_students.add(s3);
		
		Department CSE = new Department("CSE", cse_students);
		Department EE = new Department("EE", ee_students);
		
		List <Department> department = new ArrayList<Department>();
		department.add(CSE);
		department.add(EE);
		
		Institute I = new Institute ("BVB", department);
		
		System.out.println("Total students in the institue: ");
		System.out.println(I.getTotalStudentsInInstitution());
	}

}
