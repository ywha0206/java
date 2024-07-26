package sub2;
/*
 * 날짜: 2024/07/22
 * 이름: 박연화
 * 내용: 스레드 상태 실습하기
 */
class SubThread extends Thread{
	
	@Override
	public void run() { //작업 스레드로 처리할 메서드
		
		int i=1;
		
		try {
			for(;;) { 
				System.out.println("Work thread 실행..."+i);
				
				i++;
				
				
					Thread.sleep(1000); //스레드 1초 대기(=잠)
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class ThreadInterruptTest {

	public static void main(String[] args) {
		
		SubThread sub = new SubThread();
		
		sub.start();
		
		try {
			Thread.sleep(1000*10); //메인스레드 10초 정지
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		sub.interrupt(); //InterruptedException 발생시켜 작업스레드 종료
		System.out.println("Main thread 종료...");
		
	}
}
