package sub3;
/*
 * 날짜: 2024/07/09
 * 이름: 박연화
 * 내용: 클래스 변수, 메서드 실습하기
 * 
 * 클래스 변수, 메서드(정적 변수, 메서드)
 *  - static 선언한 변수, method area에 생성
 *  - 별도의 객체 생성 없이 클래스 타입으로 바로 참조
 *  - 객체 간의 데이터 공유 목적으로 클래스 변수, 메서드 사용
 *  
 *  싱글톤 객체(singleton)
 *  - 클래스 변수, 메서드를 활용한 객체 생성 방법
 *  - 싱글톤 객체는 오직 하나의 인스턴스로 메모리(method area)상에 생성
 *  - 싱글톤 객체를 사용해서 메모리절약과 성능 향상
 */
class Increment{
	
	private int num1;
	private static int num2;
	
	public Increment() {
		num1++;
		num2++;
		
		System.out.println("num1: "+num1);
		System.out.println("num2: "+num2);
	}
}

public class StaticTest {
	public static void main(String[] args) {
		
		//static 기본
		Increment inc1 = new Increment();
		Increment inc2 = new Increment();
		Increment inc3 = new Increment();
		
		//car 실습
		Car sonata = new Car("소나타", "흰색",0);
		Car Avante = new Car("아반떼", "검정",0);
		
		System.out.println("전체 차량 수: "+ Car.getTotalCount());
		sonata.show();
		Avante.show();
		
		//싱글톤 객체
		Calc c1 = Calc.getinstance();
		
		int r1 = c1.plus(1,2);
		int r2 = c1.minus(1,2);
		int r3 = c1.multi(3,2);
		int r4 = c1.div(4,2);
		
		System.out.println("r1: "+ r1);
		System.out.println("r2: "+ r2);
		System.out.println("r3: "+ r3);
		System.out.println("r4: "+ r4);
	}
}
