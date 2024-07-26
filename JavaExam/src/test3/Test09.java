package test3;
/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 추상클래스, 다형성 연습문제
 */

abstract class Shape{ //추상 클래스
	public abstract void draw(); //추상 메서드
}

class Triangle extends Shape{
	
	@Override
	public void draw() {
		System.out.println("draw Triangle!");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("draw Circle!");
	}
}


public class Test09 {
	
	public static void main(String[] args) {
		
		// draw 메서드를 호출하기 위해 만든 객체
		Test09 here = new Test09(); 

		
		//객체 생성 > 얘네는 매개변수가 될 거야
		Circle circle = new Circle();
		Triangle triangle = new Triangle();
		
		here.draw(circle);
		here.draw(triangle);
		
	}
	
	//draw 메서드
	public void draw(Shape obj) {//obj의 다형성을 위해 Shape 클래스로 선언함
		obj.draw();
	}

}
