package ch09.sec02.exam02;

public class A {
	//인스턴스 멤서 클래스
	class B{
		//인스턴스 필드
		int field1 =1;
		
		//정적 필드(java 17부터 허용)
		static int field2 =2;
		
		//생성자
		B(){
			System.out.println("B-생성자 실행");
		}
		
		//인스턴스 메서드
		void method1() {
			System.out.println("B-method1 실행");
		}
		
		//정적메서드(java 17부터 허용)
		static void method2() {
			System.out.println("B-method2 실행");
		}
	}


	//인스턴스 메서드
	void useB() {
		//B 객체 생성 및 인스턴스 필드 및 메서드 사용
		B b = new B();
		System.out.println(b.field1);
		b.method1();
		
		//B클래스의 정적 필드 및 메서드 사용
		System.out.println(B.field2);
		B.method2();
		
	}
}
