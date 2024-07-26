package test3;

class King1 {
	private String name;
	private int year;
	
	//생성자 오버로딩: 같은 이름의 생성자를 매개변수로 구분하여 여러개 정의
	public King1(int year) {
		this("정조"); // 다른 생성자 호출, 기본 이름을 "정조"로 설정
		this.year = year;		
	}	
	public King1(String name) {		
		this.name = name;
	}	
	public King1(String name, int year) {
		this.name = name;
		this.year = year;
	}	
	public void show() {
		System.out.println("name : "+name);
		System.out.println("year : "+year);
	}
}
public class Test2 {

	//오버로딩으로 구분된 여러 생성자로 초기화하여 King 객체 생성
	public static void main(String[] args) {		
		King1 k1 = new King1("태조", 1392);
		King1 k2 = new King1("세종대왕");
		King1 k3 = new King1(1776);
		
		k1.show();
		k2.show();
		k3.show();
	}	
}
