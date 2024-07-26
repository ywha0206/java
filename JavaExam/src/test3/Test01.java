package test3;
/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 자바 클래스 연습문제
 */
public class Test01 {//메인클래스
	
	private String name;
	private int age;
	
	//생성자
	public Test01(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 메서드
	//호출하려면 객체를 생성해야 함
	public void show() {
		System.out.println("==============");
		System.out.println("이름: "+ this.name);
		System.out.println("나이: "+ this.age);
		System.out.println("--------------");
	}
	
	public static void main(String[] args) {
		Test01 kim = new Test01("김유신", 23); //생성자로 선언
		Test01 lee = new Test01("이순신", 31);
	
		kim.show();//show
		lee.show();
	}
}
