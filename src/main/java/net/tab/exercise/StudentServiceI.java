package net.tab.exercise;

import java.util.List;

public interface StudentServiceI {

	public List<Student> getAllStudents();
	public Student getStudent(long id);
	public void addStudent(Student student);
	public void updateStudent(long id, Student student);
	public void deleteStudent(long id);
	
}
