package test05;

public class Subject {
	private String subNeme;
	private Student[] students;
	private int studentCount = 0;
	
	
	
	public Subject(String subNeme) {
		this.subNeme = subNeme;
		this.students = new Student[10];
	}

	public void addStudent(Student student) {
		students = null;
	}
	
	public void printSubjectInfo() {
		
	}
	
	public void addStudent() {
		
	}
}
