package test4;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;



/*
 * 날짜: 2024/07/19
 * 이름: 박연화
 * 내용: 로또번호 연습문제
 */
public class Test07 {
	public static void main(String[] args) {
		
		for(int count=1; count<=5; count++) {
			System.out.println(makeLotto());
		}
	}
	
	public static Set<Integer> makeLotto() {//here
		//집합 주머니 만들기
		Set<Integer> lottoSet = new HashSet<>();
		
		//;; 무한루프라는 뜻 (=while true)
		for(;;) {
			int num = (int) Math.ceil(Math.random() * 45); //here
			//구한 랜덤수를 주머니에 집어넣기
			lottoSet.add(num);//here
			//주머니에 여섯개의 숫자가 쌓이면 , 끝내라
			if(lottoSet.size()==6) { //here
				break;
			}
		}
		
		//정렬을 위해 treeSet 사용
		Set<Integer> treeSet = new TreeSet<>(lottoSet);
		
		return treeSet;
		
	}
}
