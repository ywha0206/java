package sub6;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpression {
	public static void main(String[] args) {
		
		// 자주 사용하는 정규표현식
				String input = "a101,홍길동,010-1234-1001,hong@gmail.com";

				// 패턴 정의
				String ptt1 = "^[a-z][a-z0-9]{3,10}$"; // 영어 소문자 1자로 시작하고 소문자, 숫자 3자리 이상 10자리 미만
				String ptt2 = "^[가-힣]*$";
				String ptt3 = "(01\\d{1})-(\\d{3,4})-(\\d{4})";
				String ptt4 = "(\\w+)@(\\w+).(\\w+)";

				// 패턴 컴파일
				Pattern p1 = Pattern.compile(ptt1);
				Pattern p2 = Pattern.compile(ptt2);
				Pattern p3 = Pattern.compile(ptt3);
				Pattern p4 = Pattern.compile(ptt4);

				// Matcher 생성
				Matcher m1 = p1.matcher(input.split(",")[0]);
				Matcher m2 = p2.matcher(input.split(",")[1]);
				Matcher m3 = p3.matcher(input.split(",")[2]);
				Matcher m4 = p4.matcher(input.split(",")[3]);

				// 아이디 찾기
				System.out.print("아이디 : ");
				while (m1.find()) {
					System.out.println(m1.group());
				}

				// 이름 찾기
				System.out.print("이름 : ");
				while (m2.find()) {
					System.out.println(m2.group());
				}
				
				// 휴대폰 찾기
				System.out.print("휴대폰 : ");
				while (m3.find()) {
					System.out.println(m3.group());
				}
				
				// 이메일 찾기
				System.out.print("이메일 : ");
				while (m4.find()) {
					System.out.println(m4.group());
				}
				
		 	}
	}

