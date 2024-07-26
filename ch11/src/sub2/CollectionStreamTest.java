package sub2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/*
 * 날짜: 2024/07/23
 * 이름: 박연화
 * 내용: 자바 컬렉션 스트림 실습하기
 */

class Person{
	private String name;
	private int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
		return "Person[name="+name+", age="+age+"]";
	}
}


public class CollectionStreamTest {
	public static void main(String[] args) {
		
		//list 생성
		List<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		
		//외부반복자를 이용해 출력
		for(int num: nums) {
			System.out.print(num+ ", ");
		}
		System.out.println();
		
		//이러게 하진 않는데 가능
		Iterator<Integer> it = nums.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+", ");
		}
		System.out.println();
		
		//내부반복자를 이용한 출력
		nums.stream().forEach((num)->{
			System.out.print(num+ ", ");
		});
		
		
		//person 리스트 생성
		List<Person> people = new ArrayList<Person>();
		people.add(new Person("김유신", 23));
		people.add(new Person("김춘추", 34));
		people.add(new Person("장보고", 29));
		people.add(new Person("강감찬", 48));
		people.add(new Person("이순신", 53));
		
		//외부반복자 이용한 출력
		for(Person person : people) {
			System.out.println(person);
		}
		
		System.out.println();
		
		//내부반복자를 이용한 출력
		people.stream().forEach((person)->{
			System.out.println(person);
		});
		
		System.out.println();
		
		people.stream().forEach(System.out::println);
		
//생성한 리스트 매개변수 이름 people.stream().feoEach((출력할 변수명)->{출력문})
//리스트매개변수이름.stream().forEach(system.out::println);
		
		
		//HashMap 생성
		Map<String, Integer> scores = new HashMap<>();
		scores.put("김유신", 92);
		scores.put("김춘추", 90);
		scores.put("장보고", 88);
		scores.put("강감찬", 72);
		scores.put("이순신", 85);
	
	
		for(String key: scores.keySet()) {
			System.out.println("key: "+ key +" vlaue: "+scores.get( key ));
		}
		
		
		//내부 반복자를 이용한 출력
		scores.keySet().stream().forEach((key)->{
			System.out.println("key: "+key+" vlaue: "+scores.get(key));
		});
	
	
		scores.entrySet().stream().forEach((entry)->{
			System.out.println("key: "+entry.getKey()+" ,value: "+entry.getValue());
		});
	
	
	}
}

















