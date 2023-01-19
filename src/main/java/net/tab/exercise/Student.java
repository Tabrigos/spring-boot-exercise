package net.tab.exercise;

public class Student {
	
	private int id;
	private String name;
	private String lastName;
	private String organization;
	private String status;
	
	public Student(int id, String name, String lastName, String organization, String status) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		this.organization = organization;
		this.status = status;
	}

	public Student() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getOrganization() {
		return organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	

}