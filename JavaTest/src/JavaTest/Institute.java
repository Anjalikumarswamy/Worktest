package JavaTest;

import java.util.List;

public class Institute {
	String Iname;
	private List<Department> departments;
	
	public Institute(String Iname, List<Department> departments) {
		this.Iname = Iname;
		this.departments = departments;
	}
	
	public int getTotalStudentsInInstitution() {
		int noOfStudents = 0;
		List<Student> students;
		for (Department dept : departments)
		{
			students = dept.getStudents();
			for(Student s : students)
			{
				noOfStudents++;
			}
		}
		return noOfStudents;
	}

}
