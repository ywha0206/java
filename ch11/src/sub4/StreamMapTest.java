package sub4;
/*
 * 날짜: 2024/07/23
 * 이름: 박연화
 * 내용: 자바 컬렉션 스트림 매핑 실습하기
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	
	@Override
		public String toString() {
		return "Person[name="+name+", age="+age+"]";
	}
}

public class StreamMapTest {
	public static void main(String[] args) {
		
		
		//person 리스트 생성
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 34));
		people.add(new Person("장보고", 29));
		people.add(new Person("강감찬", 48));
		people.add(new Person("이순신", 53));
		
		
		//map stream
		List<String> names =  people.stream()
									.map((person)->{
										//새로운 데이터로 변환해서 다음 스트림에 전달
										return person.getName(); 
									})
									//스트림으로 전송된 데이터 취합해 컬렉션으로 반환
									.collect(Collectors.toList());
		
		System.out.println(names);
		
		
		//flatMap Stream
		List<List<String>> lists = List.of(
							Arrays.asList("Apple","Banana"), 
							Arrays.asList("Cherry","Grape"),
							Arrays.asList("Orange","Mango")
						);
		
		//[(A)(B)] 2차원 배열 구조
		//[(C)(G)]
		//[(O)(G)]
		
		System.out.println(lists);
		
		
		//2차원 배열구조를 다시 1차원 배열구조로
		List<String> fruits = lists.stream()
									.flatMap((list)->{
										return list.stream(); 
										//리스트 스트림이 작은 리스트()() 를 다시 내보내는 것 개별적으로 
										//여섯개짜리 리스트가 됨
									})
									.collect(Collectors.toList());
		
		System.out.println(fruits);
		
	}
}
