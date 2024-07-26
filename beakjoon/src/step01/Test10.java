package step01;

import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int one = b%10;
		int ten = (b/10)%10;
		int hundreds = b/100;
		
		System.out.println(a*one);
		System.out.println(a*ten);
		System.out.println(a*hundreds);
		System.out.println(a*b);
		
		sc.close();
		
	}
}
