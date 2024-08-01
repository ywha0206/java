package test5;

import test2.test01;

/*
 * 날짜: 2024/08/01
 * 이름: 박연화
 * 내용: 자바 총정리 연습문제
 */
public class Test01 {
	public static void main(String[] args) {
		
		char var1 = 'A';
		int var2 = var1; //char 는 아스키 코드로 int 변환이 가능
		char var3 = 'B';
		int var4 = var1 + var3;
		String var5 = """
						Hello World!
						Hello Korea!
						Hello Busan!
						""";
		
		System.out.println("var1: " + var1);
		System.out.println("var2: " + var2);
		System.out.println("var3: " + var3);
		System.out.println("var4: " + var4);
		System.err.println(var5);
		
		int a = 10;
		int b = 5;
		
		System.out.println(a>b || a==b);
		System.out.println(a<b && a==b);
		
		System.out.println(a>b ^ a==10); //^ XOR 연산 false false = true 같은 값이면 트루로 반환
		System.out.println(a>b ^ a==b);
		
		System.out.println(a==b & test(1));
		System.out.println(a==b && test(2));
		
		System.out.println(b>0 & (a/b>0));
		System.out.println(b>0 && (a/b>0));
		
	}
	
	
	public static boolean test(int n) {
		System.out.println("test("+n+") 실행...");
		return true;
	}
	
}
