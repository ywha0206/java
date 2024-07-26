package sub3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/*
 * 날짜: 2024/07/18
 * 이름: 박연화
 * 내용: 직렬화 실습하기
 */
public class SerializeTest {
	public static void main(String[] args) {
		Apple apple = new Apple("한국", 3000);
				
		String path = "C:\\Users\\lotte4\\Desktop\\apple.txt";		
		
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			
			
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			
			//객체 직렬화(내보내기
			oos.writeObject(apple);
			
			//스트림 해제
			oos.close();
			fos.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	
				
				
				
				
	}
}
