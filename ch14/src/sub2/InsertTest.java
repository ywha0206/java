package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜: 2024/07/29
 * 이름: 박연화
 * 내용: Insert 실습
 */
public class InsertTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			
			//2단계 - SQL 실행객체 statement 생성
			Statement stmt = conn.createStatement();
			
			
			//3단계 - SQL 실행
			String sql = "INSERT INTO `user1` VALUES('J101','김유신','1990-01-21','010-1234-1001',23)";
			stmt.executeUpdate(sql); //쿼리문 sql을 실행한다
			
			
			//4단계 - Resultset 결과 처리 (select일 경우)
			//5단계 - 접속 종료
			stmt.close();
			conn.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("INSERT 완료...");
	}
}
