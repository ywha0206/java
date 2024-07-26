package sub2;

import java.util.Scanner;

/*
 * 날짜: 2024/07/01
 * 이름: 박연화
 * 내용: 조건문 Switch 실습 
 */
public class SwitchTest {
	public static void main(String[] args) {
		
		System.out.print("숫자 입력 : ");
		
		//콘솔입력
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); //숫자 입력받기
		
		System.out.println("입력한 숫자 : " + number);
		
		switch(number % 2) {
			
			case 0:
				System.out.println("number는 짝수");
				break;
				
			case 1:
				System.out.println("number는 홀수");
				break;
		
		
		}
		
	}
}
