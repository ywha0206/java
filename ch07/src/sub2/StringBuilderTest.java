package sub2;
/*
 * 날짜: 2024/07/16
 * 이름: 박연화
 * 내용: 자바 StringBuilder 클래스 실습하기
 */
public class StringBuilderTest {
	public static void main(String[] args) {
		
		//String 불변(immutable) 특성
		String str = "Java";
		System.out.println("str 주소: "+ System.identityHashCode(str));
	
		str += "Programing";
		System.out.println("str 주소: "+ System.identityHashCode(str));
	
		System.out.println("str: "+str);
		
		//String의 불변 특성을 개선한 StringBuilder
		StringBuilder sb = new StringBuilder("Java");
		
		System.out.println("sb주소: "+System.identityHashCode(sb));
		
		sb.append("Programimg");
		System.out.println("sb주소: "+System.identityHashCode(sb));
		
		System.out.println("sb: "+sb);
	}
}
