package test3;

class Student1{
	// 필드 선언 - private로 선언하면 참조가 안 되니까 public 선언
	// static - 모든 인스턴스가 공유하는 클래스 변수
	public static int studentId;
	// private 필드는 캡슐화를 위해 사용되며, getter/setter를 통해 접근 가능합니다.
	private String studentName;
	private String major;
	private int grade;
	
	//생성자 정의 - 매개변수로 이름, 전공, 학년을 할당받는다
	public Student1(String studentName, String major, int grade) {
		
		//클래스 이름으로 접근해서 증감 연산자로 +1씩 증가하게끔 정의
		Student1.studentId++;
		//선언한 필드 초기화
		this.studentName = studentName;
		this.major = major;
		this.grade = grade;
	}
	
	//출력 메서드
	public void studentInfo() {
		System.out.println("===============");
		System.out.println("학번: "+studentId);
		System.out.println("이름: "+studentName);
		System.out.println("전공: "+major);
		System.out.println("학년: "+grade);
		System.out.println("---------------");
	}
}
public class Test4 {
	public static void main(String[] args) {
		//정적변수 studentId 초기화
		Student1.studentId = 20201000;
		
		Student1 kim = new Student1("김유신","국문과",1);
		kim.studentInfo();
		
		Student1 lee = new Student1("이순신","경제학과",1);
		lee.studentInfo();
		
		Student1 lim = new Student1("임꺽정","경영학과",1);
		lim.studentInfo();
	}
}
