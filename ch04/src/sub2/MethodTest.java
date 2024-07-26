package sub2;
/*
 * 날짜:2024/07/02
 * 이름: 박연화
 * 내용: Java 메서드 실습하기
 */
public class MethodTest {
	
	//메인 메서드 - 프로그램 진입점
	public static void main(String[] args) {
		
		//메서드 호출(call)
		int y1 = f(1); // 1. 인자값 1을 전달해서 f 메서드 호출
		int y2 = f(2);
		int y3 = f(3);
		
		System.out.println("y1 : " + y1);
		System.out.println("y2 : " + y2);
		System.out.println("y3 : " + y3);
		
		
		int z1=sum(1,5);
		
		System.out.println(z1);
	}
	

	
	//메서드 정의
	public static int f(int x) {
		int y = 2 * x + 3; // 2. 전달된 인자값을 매개변수 x로 받아서 메서드 실행
		return y; // 3. 메서드를 호출한 쪽으로 반환값 전달(리턴)
	}
	
	//메서드 정의
	public static int sum(int start, int end) {
		
		int total = 0; //지역변수: 메서드 안에서 선언된 변수
		
		for(int k=start ; k<=end ; k++) {
			total += k;
		}
		
		return total;
	}
	
}
