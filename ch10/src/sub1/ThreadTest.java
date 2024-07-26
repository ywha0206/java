package sub1;
/*
 * 날짜: 2024/07/22
 * 이름: 박연화
 * 내용: 자바 스레드 실습하기
 */
public class ThreadTest {
	public static void main(String[] args) {
		
		SubThread sub1 = new SubThread("sub1");
		SubThread sub2 = new SubThread("sub2");
		
		//작업 스레드 시작
		sub1.start(); //멀티 스레드로 병행 실행됨
		sub2.start();
		
		
		for(int i=0; i<10; i++) {
			
			System.out.println("main thread 실행...");
			
			try {
				Thread.sleep(1000); //스레드 1초 대기(=잠)
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println("main thread 종료...");
	}
}
