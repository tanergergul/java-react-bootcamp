package oopIntro;

public class TeacherManager {
	
	public void addTeacher(Teacher teacher) {
		System.out.println("Teacher added: " + teacher.firstName + " " + teacher.lastName);
	}
	
	public void increaseSalary(Teacher teacher,int add) {
		teacher.salary += add;
		System.out.println("Salary increased +" + add);
		System.out.println( teacher.firstName + " " + teacher.lastName  + "'s New salary: " + teacher.salary);
	}

}
