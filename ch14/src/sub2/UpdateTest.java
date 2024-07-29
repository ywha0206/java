package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*
 * 날짜: 2024/07/29
 * 이름: 박연화
 * 내용: Update 실습
 */
public class UpdateTest {
	public static void main(String[] args) {
		
		//DB정보
				String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //마지막 접속 데이터베이스명
				String user = "root";
				String pass = "1234";
		
		try {
			//데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			//SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			//SQL 실행
			String 	sql = "update `user1` set ";
					sql += "`hp`='010-1234-1111', ";
					sql += "`age`=25 ";
					sql += "where `uid`='J101'";
			stmt.executeUpdate(sql);
			
			//접속종료
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
				
		
		System.out.println("update 완료...");
		
	}
}
