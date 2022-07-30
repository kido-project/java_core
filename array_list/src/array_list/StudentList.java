package array_list;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> students = new ArrayList<Student>();

	public void add(Student student) {
		students.add(student);
	}

	public void print() {
		for (Student student : this.students) {
			System.out.println("Name: " + student.getName());
		}
	}

	public void remove(int index) {
		students.remove(index);
	}

	public void update(int index, Student newStudent) {
		students.set(index, newStudent);
	}

	public Student findStudent(String studentName) {
		for (Student student : this.students) {
			if (student.getName() == studentName) { // just example
				return student;		}
		}
		return null;
	}
}
