package test3;
/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 정적변수 연습문제
 */

class Student{
	public static int studentId;
	private String studentName;
	private String major;
	private int grade;
	
	public Student(String studentName, String major, int grade) {
		this.studentId++;
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	public void studentInfo() {
		System.out.println("================");
		System.out.println("학번: "+ getStudentId());
		System.out.println("이름: "+ studentName);
		System.out.println("전공: "+ major);
		System.out.println("학년: "+ grade);
		System.out.println("----------------");
	}

	public static int getStudentId() {
		return studentId;
	}

	public static void setStudentId(int studentId) {
		Student.studentId = studentId;//스튜던트 클래스로 직접참조 > 스태틱이 되어야 함
	}
}

public class Test04 {
	public static void main(String[] args) {
		Student.studentId = 20201000;
		
		Student kim = new Student("김유신","국문과",1);
		kim.studentInfo();
		
		Student lee = new Student("이순신","국문과",1);
		lee.studentInfo();
		
		Student lim = new Student("임꺽정","국문과",1);
		lim.studentInfo();
		
		
	}

}
