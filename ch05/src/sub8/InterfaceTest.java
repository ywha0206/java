package sub8;
/*
 * 날짜: 2024/07/11
 * 이름: 박연화
 * 내용: 인터페이스 실습하기
 */

/*
	인터페이스
		- 표준화된 클래스 설계에 사용되는 구조체
		- 오직 추상 메서드만 선언
		- 인터페이스를 활용해서 다형성을 구현하고 객체간 결합도를 완화
		- 다중상속 효과
*/

class Computer{
	public void boot() {
		System.out.println("부팅...");
	}
}

interface Internet{
	public void access();
}
//상속 먼저 하고 구현
class TV extends Computer implements Internet{
	
	public void show() {
		System.out.println("TV 시청...");
	}

	@Override
	public void access() {
		System.out.println("인터넷 접속...");
	}
}

public class InterfaceTest {
	public static void main(String[] args) {
		
		//인터페이스 실습1 - 표준화된 클래스 설계
		RemoteControl lg = new RemoteLG();
		RemoteControl ss = new RemoteSamsung();
		
		lg.powerOn();
		lg.chUp();
		lg.soundUp();
		lg.powerOff();
		
		ss.powerOn();
		ss.chUp();
		ss.soundUp();
		ss.powerOff();
		
		//인터페이스 실습2 - 다형성 예제
		Bolb bolb = new Bolb();
		Socket socket = new Cable(bolb);
		
		socket.switchOn();
		socket.switchOff();
		
		//인터페이스 실습3 - 다중 상속 효과 예제 
		//다중상속: 두 부모에게 상속받는 것
		// 인터페이스를 이용하면 한 부모에게는 상속받고 
		//한 부모에게는 인터페이스를 구현하는 방식으로 다중상속을 구현할 수 있따
		//다형성 적용이 안 됨
		
		TV tv = new TV();
		tv.boot();
		tv.access();
		tv.show();
	}
}
