package net.tab.exercise;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public class StudentServiceDB implements StudentServiceI {

	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public List<Student> getAllStudents() {
		// TODO Auto-generated method stub
		return studentRepository.findAll();
	}

	@Override
	public Student getStudent(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent(long id, Student student) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent(long id) {
		// TODO Auto-generated method stub

	}

}
