package sub2;
/*
 * 날짜: 2024/07/22
 * 이름: 박연화
 * 내용: 스레드 상태 실습하기
 */

class WorkThread extends Thread{
	@Override
	public void run() { //작업 스레드로 처리할 메서드
		
		for(int i=0; i<10; i++) {
			System.out.println("Work thread 실행...");
			
			try {
				Thread.sleep(1000); //스레드 1초 대기(=잠)
			} catch (InterruptedException e) {
				e.printStackTrace();
			} 
		}
	
		System.out.println("Work thread 종료...");
	}
}


public class ThreadJoinTest {
	public static void main(String[] args) {
		
		WorkThread work = new WorkThread();
		
		work.start();
		
		try {
			work.join(); //작업 thread 대기
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("main thread 종료..."); //프로그램 종료
		
		
	}
}
