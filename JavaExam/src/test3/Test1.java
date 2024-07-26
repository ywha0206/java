package test3;

public class Test1 { // 메인 클래스

	//변수 선언, 필드(속성) 객체의 상태를 저장
	private String name;
	private int age;
	
	//생성자 선언:  객체 초기화를 위한 메서드
	public Test1(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	//인스턴스 메서드 - 객체의 데이터를 출력
	public void show() {
		System.out.println("===============");
		System.out.println("이름: "+ this.name);
		System.out.println("나이: "+ this.age);
		System.out.println("===============");
	}
	
	public static void main(String[] args) {

		//Test1 클래스로 kim 객체 생성하고 생성자 Test1을 통해 초기화
		Test1 kim = new Test1("김유신",23); 
		Test1 lee = new Test1("김유신",23);
		
	
		kim.show();
		lee.show();
	}
}
