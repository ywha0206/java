package test4;

import java.util.ArrayList;
import java.util.List;

/*
 * 날짜: 2024/07/19
 * 이름: 박연화
 * 내용: 객체 리스트 연습문제
 */


class Member{
	String id;
	String name;
	int age;
	
	public Member(String id, String name, int age) {
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	@Override
		public String toString() {
		return id+","+name+","+age;
	}
	
}

public class Test08 {
	public static void main(String[] args) {
		
		Member m1 = new Member("hong","홍길동",30);
		Member m2 = new Member("kim","김철수",30);
		Member m3 = new Member("lee","이영희",30);
		
		List<Member> memberList = new ArrayList<>(); //here
		memberList.add(m1);//add 되는 게 m1 ... > 얘네 타입 멤버
		memberList.add(m2);
		memberList.add(m3);
		
		//멤버리스트 가지고 반복해
		for(Member m : memberList) {
			System.out.println(m); //m : 투스트링 호출
		}
		
		
	}
}
