package net.tab.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class StudentService {

	private List<Student> students = new ArrayList<>(Arrays.asList
			(new Student(2, "Peppe", "Pizza", "Napoli", "Idle"),
			new Student(3, "Calo", "Ggero", "Palermo", "Acrive")));

	public List<Student> getAllStudents() {
		return students;
	}
	
	public Student getStudent(int id) {
		return students.stream()
				.filter(s -> s.getId() == id)
				.findFirst()
				.get();
	}
	
	public void addStudent(Student student) {
		students.add(student);
	}
	
	public void updateStudent(int id, Student student) {
		for(int i = 0; i < students.size(); i++) {
			Student s = students.get(i);
			if(s.getId() == id) {
				students.set(i, student);
			}
		}
	}
	
	public void deleteStudent(int id) {
		students.removeIf(s -> s.getId() == id);
	}
	
}
