package ch08.sec02;

public class Television implements  RemoteControl{
	
	@Override
	public void turnOn() {
		System.out.println("티비를 켭니다.");
	}

}
