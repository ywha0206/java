package test3;
/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 싱글톤 객체 연습문제
 */

class Vehicle{ // 클래스 정의, 차량 정보를 저장
	private String name; //차량 이름
	private int price; //차량 가격 필드로 선언
	
	//Vehicle 클래스의 생성자, 차량 이름과 가격 객체를 초기화
	public Vehicle(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	//차량 정보를 출력하는 메서드
	public void info() {
		System.out.println("===========");
		System.out.println("차량명: "+name);
		System.out.println("가격: "+price);
		System.out.println("-----------");
	}
}

class CarFactory{ //CarFactory 클래스 정의, 싱글톤 패턴을 사용
	//유일한 인스턴스 생성, 정적 필드
	private static CarFactory instance = new CarFactory();
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		return instance;
	}//싱글톤 객체 통으로 눈에 익혀 
	//메서드반환타입자리 (뉴비히클
	public Vehicle createCar(String name, int price) {
		return new Vehicle(name, price);
	}
}

public class Test05 {
	public static void main(String[] args) {
		CarFactory factory = CarFactory.getInstance();//카팩토리 게터로 호ㅜㅊㄹ
				
		Vehicle avante = factory.createCar("아반테",2500);
		Vehicle sonata = factory.createCar("소나타",3000);
		
		avante.info();
		sonata.info();
	}
}
