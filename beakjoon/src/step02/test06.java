package step02;

import java.util.Scanner;

public class test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int hh = sc.nextInt();
		int mm = sc.nextInt();
		int M = sc.nextInt();
		
		
		
		mm+=M;
		
		if(mm>=60) {
			hh+=mm/60;
			mm%=60;
		}
		
		if(hh>23) {
			hh%=24;
		}
		
		System.out.println(hh+" "+mm);
		
		sc.close();
	}
}
