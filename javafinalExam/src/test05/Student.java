package test05;

public class Student {
	private String name;
	private String studentId ;
	private Subject[] subjects;
	private int[] scores;
	private int subjectCount = 0;
	
	

	public Student(String name, String studentId) {
		this.name = name;
		this.studentId = studentId;
		this.subjects = new Subject[10];
		this.scores = new int[10];
	}

	public void enrollSubject(Subject subject) {
		
	}
	
	public void setScore(Subject subject, int score) {
		
	}
	
	public void printStudentInfo() {
		System.out.println("이름: "+name);
		System.out.println("아이디: "+studentId);
		System.out.println("수강과목: "+subjects);
		System.out.println("성적: "+scores);
	}
	
	public String getName() {
		return name;
	}
}
