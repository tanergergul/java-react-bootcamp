package oopIntro;

public class Teacher {
	
	int id;
	String firstName;
	String lastName;
	int salary;
	String lesson;
	
	public Teacher() {
		System.out.println("teacher created.");
	}
	
	public Teacher(int id,String firstName, String lastName, int salary, String lesson) {
		this();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.lesson = lesson;
	}

}
