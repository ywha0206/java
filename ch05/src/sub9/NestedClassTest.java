package sub9;

import sub9.Outer.Inner;

/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 중첩 클래스 실습하기
 */

// 외부클래스
class Outer{
	
	private int x;
	
	public Outer(int x) {
		this.x = x;
	}
	
	public void show() {
		System.out.println("Outer x: " + x);
	}
	
	//내부 클래스
	class Inner{
		
		private int x;
		
		public Inner(int x) {
			this.x = x;
		}
		
		public void show() {
			System.out.println("Inner x: " + x);
		}
		
	}//Inner class

}//Outer class

interface Person{
	public void hello();
}



public class NestedClassTest {
	public static void main(String[] args) {
		
		//외부 객체 생성
		Outer out = new Outer(1);
		out.show();
		
		//내부객체 생성
		Inner inn = out.new Inner(2);
		inn.show();
		
		
		//익명객체 실습
		Person p = new Person() {

			@Override
			public void hello() {
				System.out.println("Person hello...");
				
			}
			
		};
		p.hello();
	}
}
