package ch09.sec03.exam01;

public class A {
	//정적 멤버 클래스
	static class B{}
	
	//인스턴스 필드값으로 B객체 대입
	B feild1 = new B();
	
	//정적필드 값으로 B객체 대입
	static B feild2 = new B();
	
	//생성자
	A(){
		B b = new B();
	}
	
	//인스턴스 메서드
	void method1() {
		B b = new B();
	}
	
	//정적 메서드
	static void method2() {
		B b = new B();
	}
	
	
	
	
}
