package sub1;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
 * 날짜: 2024/07/24
 * 이름: 박연화
 * 내용: http 통신 실습하기
 */
public class HttpTest {
	public static void main(String[] args) {
		
		FileOutputStream fos = null;
		BufferedReader br = null;
		
		try {
			URL url = new URL("https://www.naver.com/");//작대기 그어진거 디플리케이트 > 이 코드 쓰지 말라는 뜻
			
			br = new BufferedReader(new InputStreamReader(url.openStream()));
			fos = new FileOutputStream("./result.txt");
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
				fos.write(line.getBytes());
			}
			
			br.close();
			fos.close();
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		System.out.println("프로그램 종료...");
		
		
	}
}
