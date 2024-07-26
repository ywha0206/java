package step02;
/*
 * ### 설명:
1. **입력 받기**:
    - `Scanner` 객체를 사용하여 시간(H)과 분(M)을 입력받습니다.

2. **45분 앞당기기**:
    - 먼저 분(M)이 45분보다 작은 경우, 시간(H)을 한 시간 줄이고, 
    분(M)에 60을 더합니다.
    - 그 후에 분(M)에서 45를 뺍니다.

3. **시간 보정**:
    - 시간이 음수가 된 경우, 이를 보정하여 23시로 변경합니다.

4. **결과 출력**:
    - 앞당긴 알람 시간을 출력합니다.
 */
import java.util.Scanner;

public class test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		m -= 45;
		
		if(m<0) {
			m += 60;
			h -= 1;
		}
		
		if(h <0) {
			h = 23;
		}
		
		System.out.println(h +" "+ m );
		
		sc.close();		
	
	}
}
