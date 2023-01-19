package net.tab.exercise;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StrudentsController {

	@GetMapping("/students")
	public List<Student> getAllStudents() {

		List<Student> students = new ArrayList<>();
		students.add(new Student(2, "Peppe", "Pizza", "Napoli", "Idle"));
		
		return students;
	}
	
}
