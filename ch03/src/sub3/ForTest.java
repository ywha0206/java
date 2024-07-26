package sub3;
/*
 * 날짜: 2024/07/01
 * 이름: 박연화
 * 내용: 반복문 For 실습 
 */
public class ForTest {
	public static void main(String[] args) {
		
//		for
		
		for(int i=1 ; i<=10 ; i++) {
			
			System.out.println("i : " + i);
		}
		
//		1부터10까지 합
		int sum = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			//sum = sum + k;
			sum += k;
		}
		
		System.out.println("1부터 10까지의 합: " +sum);
		
//		1부터 10까지 짝수합
		int total = 0;
		
		for(int k=1 ; k<=10 ; k++) {
			if(k % 2 == 0) {
				total += k;
			}	
		}
		System.out.println("1부터 10까지의 짝수 합: " +total);
		
//		for 중첩
		for(int a=1 ; a<=3 ; a++) {
			System.out.println("a : " + a);
			for(int b=1 ; b<=5 ; b++) {
				System.out.println("b : " + b);
			}
		}
		
//		구구단
		for(int x=2 ; x<=9 ; x++) {
			System.out.println(x + "단");
			for(int y=1 ; y<=9 ; y++) {
				int z = x * y;
				System.out.println(x + " x " + y + " = " + z );
			}
		}
		
//		별삼각형
		
		for(int start=10 ; start>=1 ; start-- ) {
			for(int end=1 ; end<=start ; end++) {
				System.out.print("☆");
			}
			System.out.println();
		}
		
		
		
	}
}
