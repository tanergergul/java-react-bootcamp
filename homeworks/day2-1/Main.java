package oopIntro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student student1 = new Student(1,"Taner","Gergül",90,"Java Programming");
		Student student2 = new Student(2,"Salih","Karli",90,"Python Programming");
		Student student3 = new Student(3,"Kadir","Erdem",90,"Artificial Intelligence");
		Teacher teacher = new Teacher(1,"Engin","Demiroð",15000,"Java Programming");
		
		Student[] students = {student1,student2,student3};
		
		
		System.out.println("---------STUDENTS---------");
		for(Student student:students) {
			System.out.println("First Name: " + student.firstName + " Last Name: " + student.lastName + " Lesson: " + student.lesson);
		}
		System.out.println("---------METHODS---------");
		TeacherManager teacherManager = new TeacherManager();
		
		teacherManager.addTeacher(teacher);
		teacherManager.increaseSalary(teacher, 500);
		teacherManager.increaseSalary(teacher, 700);
		
		
		
	}

}
