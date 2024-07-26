package test4;
/*
 * 날짜: 2024/07/19
 * 이름: 박연화
 * 내용: java API 클래스 연습문제
 */
class Apple{
	private String country;
	private int price;
	
	//생성자
	public Apple(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	//부모 클래스가 없는 경우 오버라이드 >> 오브젝트다
	@Override
		public String toString() {
		
		return "Apple [country =" + country + ", price="+price+"]";
	}
	
}

class Banana{
	private String country;
	private int price;
	
	public Banana(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
		public String toString() {
		
		return "Banana [country =" + country + ", price="+price+"]";
	}
	
}

class Grape{
	private String country;
	private int price;
	
	public Grape(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	@Override
		public String toString() {
		
		return "Grape [country =" + country + ", price="+price+"]";
	}
	
}

public class Test05 {

	public static void main(String[] args) {
		
		Apple apple = new Apple("한국", 3000);
		Banana banana = new Banana("미국", 3000);
		Grape grape = new Grape("일본", 3000);
		
		showInfo(apple);
		showInfo(banana);
		showInfo(grape);

		
	}

	//apple를 타입으로 받아오면 바나나와 포도가 안돼 그러니까 세 클래스의 부모인 오브젝트로 타입을 가져옴
	public static void showInfo(Object/*매개변수 타입을 받아와야 돼 업캐스팅*/ fruit) {
		if(fruit instanceof Apple) { //애플의 인스턴스 중에 하나냐 (다운캐스팅
			Apple apple = (Apple) fruit;
			System.out.println(apple); //투스트링이 생략된 것
			
		}else if(fruit instanceof Banana) {
			Banana banana = (Banana) fruit;
			System.out.println(banana);
			
		}else if(fruit instanceof Grape) {
			Grape grape = (Grape) fruit;
			System.out.println(grape);
		}
		
	}
}
