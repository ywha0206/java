package sub5;

public class Sedan extends Car {

	private int cc;
	
	public Sedan(String name, String color, int speed, int cc) {
		super(name, color, speed); //부모 클래스 생성자 호출
		this.cc = cc;
	}
	
	@Override
	public void speedUp(int speed) {
		//Sedan에 맞게 speedup 메서드 재정의
		
		this.speed += speed * cc; 
		
	}
	
	public void show() {
		super.show();
		System.out.println("배기량: "+cc);
	}
	
	
}
