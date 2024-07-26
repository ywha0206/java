package ch07.sec08.exam01;

public class CarExample {
	public static void main(String[] args) {
		//Car객체 생성
		Car myCar = new Car();
		
		
		//Tire 객체 장착
		myCar.tire = new Tire();
		myCar.run();
		
		//HankookTire 객체 장착
		myCar.tire = new HankookTire();
		myCar.run();
		
		//kumhoTire 객체 장학
		myCar.tire = KumhoTire();
		myCar.run();
	}
}
