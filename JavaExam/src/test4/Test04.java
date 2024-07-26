package test4;
/*
 * 날짜: 2024/07/19
 * 이름: 박연화
 * 내용: java 문자열 연습문제
 */

public class Test04 {
	public static void main(String[] args) {
		
		String fileName = "HelloWorld.java"; 

		//점을 기준으로 자를 거야 점의 인덱스를 구해라 뒤에서부터 구해야 돼
		int idx = fileName.lastIndexOf('.');
		
		String title 	= fileName.substring(0,idx);//0부터 idx까지
		String ext 		= fileName.substring(idx+1);//idx+1 인덱스 넘버부터
		
        System.out.println("파일명: " + title);
        System.out.println("확장자: " + ext);
		
        
        String		strScores = "60, 72, 82, 86, 92";
        String[]	scores = strScores.split(",");//배열로 분리하는 거야 구분자는 콤마
        		
		int total = 0;
        
        for(String score: scores) {
        	//숫자로 변환해야 함 > parseInt 근데 공백은 변환이 안 돼 > trim()
        	total += Integer.parseInt(score.trim()); 
        	
        }
		System.out.println("strScores 총점: " + total);
		
	}
}
