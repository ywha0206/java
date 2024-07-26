package test4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * 날짜: 2024/07/19
 * 이름: 박연화
 * 내용: 컬렉션 연습문제
 */

class Orange{
	private String country;
	private int price;
	
	public Orange(String country, int price) {
		this.country = country;
		this.price = price;
	}
	
	public void show() {
		System.out.println("\n 원산지: "+country+"\n 가격: " +price);
	}
	
}


public class Test09 {
	public static void main(String[] args) {
		
		/*here*/List<Orange> list1 = new ArrayList<>();
		list1.add(new Orange("파주",3000));
		list1.add(new Orange("이천",3000));
		list1.add(new Orange("수원",3000));
		

		/*here*/List<Orange> list2 = new ArrayList<>();
		list2.add(new Orange("청주",3000));
		list2.add(new Orange("충주",3000));
		list2.add(new Orange("단양",3000));
		

		/*here*/List<Orange> list3 = new ArrayList<>();
		list3.add(new Orange("밀양",3000));
		list3.add(new Orange("함안",3000));
		list3.add(new Orange("합천",3000));
		
		/*here*/Map<String, List<Orange>> map = new HashMap<String, List<Orange>>();
		map.put("gyeonggi", list1);
		map.put("chungbuk", list2);
		map.put("gungnam", list3);
		
		List<Orange> list = map.get("gyeonggi");//here
		Orange orange = list.get(2);
		orange.show();
		
		map.get("chungbuk").get(1).show();
		map.get("gungnam").get(0).show();
		
		
	}
}
