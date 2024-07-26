package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
		//long var3 = 1000000000000;
		long var4 = 1000000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
		
		// long 타입으로 선언해도 컴파일러가 int 타입으로 읽기 때문에 
		// int 타입이 수용 가능한 범위의 정수를 입력할 때는 L를 뒤에 붙여주지 않아도 오류가 발생하지 않지만
		// int 타입의 수용범위를 벗어나는 정수 입력시 L을 붙여줘야 한다는 의미 맞나요?
	}
}
