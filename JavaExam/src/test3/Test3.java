package test3;

class Car1{
	
	//필드 선언
	private String brand;
	private String name;
	private int price;
	
	//생성자 초기화
	public Car1(String brand, String name, int price) {
		this.brand = brand;
		this.name = name;
		this.price = price;
	}
	
	//메서드 정의
	public void drive() {
		System.out.println(name+" 운행 중...");
	}
	
	public void info() {
		System.out.println("브랜드: "+ brand);
		System.out.println("차량명: "+ name);
		System.out.println("가 격: "+ price);
	}
	
}
public class Test3 {
	public static void main(String[] args) {
		
		// Car1 클래스에 객체 생성 임시로 null 참조하여 객체의 타입을 지정했다
		Car1 sonata = null;
		Car1 bmw = null;
		// 타입이 이미 지정되었기 때문에 다시 지정할 필요는 없음
		sonata = new Car1("현대","소나타",3000);
		bmw = new Car1("bmw","520d",5000);
		
		sonata.drive();
		sonata.info();
		
		bmw.drive();
		bmw.info();
	}
}
