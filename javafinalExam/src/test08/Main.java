package test08;
/*
 * 날짜: 2024/08/01
 * 이름: 박연화
 * 내용: 자바 총정리 문제
 */
public class Main {
	public static void main(String[] args) {
		
		Person person = new Person("김유신", "1990-05-07");
		person.printPersonInfo();
		System.out.println("-----------------------");

		Employee emp = new Employee("김춘추", "1992-07-14", "E001", "영업부", 200);
		emp.printEmployeeInfo();
		System.out.println("-----------------------");

		Developer dev = new Developer("장보고", "1995-10-21", "D001", "개발부", 300, "프론트");
		dev.printDeveloperInfo();
		System.out.println("-----------------------");
		
		//부서 변경 테스트
		emp.changeDept("인사부");
		emp.printEmployeeInfo();
		System.out.println("-----------------------");
		
		//급여 인상 테스트
		dev.changeField("백엔드");
		dev.raiseSalary(50);
		dev.printDeveloperInfo();
		System.out.println("-----------------------");
		
	}
}
