package ch07.sec09;

import ch05.sec11.MainStringArrayArgument;

public class InstanceofExample {
	//main 메소드에서 바로 호출하기 위해 정적 메소드 선언
	public static void personInfo(Person person) {
		System.out.println("name: "+ person.name);
		person.walk();
		
		//person이 참조하는 객체가 Student 타입인지 확인
		/*
		 if(person instanceof Student){
		 Student student = (Student) person;
		 //Student 객체만 가지고 있는 필드 및 메소드 사용
		 system.out.printIn("studentNo: "+student.dtudentNo);
		 dtudent.study();
		 }*/
		
		//person이 참조하는 객체가 student 타입일 경우
		//student변수에 대입(타입 변환 발생)
		if(person instanceof Student student) {
			System.out.println("studentNo: "+student.studentNo);
			student.study();
		}
		
	
	}
	public static void main(String[] args) {
		//person 객체를 매개값으로 제공하고 personInfo()메소드 호출
		Person p2 = new Student("김길동",10);
		personInfo(p2);
	}
}
