package ch08.sec11.exam01;

public class KumhoTire implements Tire {
	//추상메서드 재정의
	@Override
	public void roll() {
		System.out.println("금호타이어가 굴러갑니다.");
	}
}
