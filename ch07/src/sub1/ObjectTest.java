package sub1;
/*
 * 날짜: 2024/07/15
 * 이름: 박연화
 * 내용: 자바 Object 클래스 실습
 */
public class ObjectTest {
	public static void main(String[] args) {
		
		Apple a1 = new Apple("한국",3000);
		Apple a2 = new Apple("일본",2000);
	
		//toString() 객체 정보 조회
		System.out.println(a1.toString());
		System.out.println(a2);
		
		//equals() 객체 비교
		if(a1 == a2) {
			System.out.println("a1, a2가 주소값(참조값) 같다.");
		}else {
			System.out.println("a1, a2가 주소값(참조값) 다르다.");
		}
		
		if(a1.equals(a2)) {
			System.out.println("a1, a2가 객체 같다.");
		}else {
			System.out.println("a1, a2가 객체 다르다.");
		}
		
		
		//객체 해시값(유일값)
		System.out.println("a1 해시값: " + a1.hashCode());
		System.out.println("a2 해시값: " + a2.hashCode());
	}
}
