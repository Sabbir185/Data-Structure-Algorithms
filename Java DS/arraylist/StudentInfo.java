package arraylist;

import java.util.ArrayList;
import java.util.Iterator;

class Student {
	public String nameString;
	public int id;
	public String dept;
	public String section;

	public Student(String nameString, int id, String dept, String section) {

		this.nameString = nameString;
		this.id = id;
		this.dept = dept;
		this.section = section;

	}

}

public class StudentInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student("SABBIR", 185, "CSE", "4A");
		Student s2 = new Student("Motiur", 192, "CSE", "4A");
		Student s3 = new Student("Nazib", 195, "CSE", "4A");
		Student s4 = new Student("Kiron", 061, "CSE", "4A");
		
		
		ArrayList<Student> students = new ArrayList<Student>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		
		Iterator itr = students.iterator();
		
		while ( itr.hasNext() ) {
			
			Student student =(Student) itr.next();
			
			System.out.println( student.nameString+", " + student.id+", "  + student.dept+", "  + student.section );
		}
		

	}

}
