package oopIntro;

public class Student {
	
	int id;
	String firstName;
	String lastName;
	int gpa;
	String lesson;
	
	public Student() {
		System.out.println("student created.");
	}
	
	public Student(int id, String firstName, String lastName, int gpa, String lesson) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gpa = gpa;
		this.lesson = lesson;
	}

}
