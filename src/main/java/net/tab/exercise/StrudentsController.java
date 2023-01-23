package net.tab.exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentsController {

	@Autowired
	private StudentService studentService;
	
	@GetMapping("/students")
	public List<Student> getAllStudents() {
		return studentService.getAllStudents();
	}
	
	public Student getStudent(int id) {
		return studentService.getStudent(id);
	}
	
	public void addStudent(Student student) {
		studentService.addStudent(student);
	}
	
}
