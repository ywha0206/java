package ch09.sec03.exam02;

public class AExample {
	public static void main(String[] args) {
		//B 객체 생성 및 인스턴스 필드 및 메서드 사용
		A.B b = new A.B();
		System.out.println(b.feild1);
		b.method1();
		
		//B 클래스의 정적 필드 및 메서드 사용
		System.out.println(A.B.feild2);
		A.B.method2();
	}
}
