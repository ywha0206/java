package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*
 * 날짜: 2024/07/29
 * 이름: 박연화
 * 내용: Select 실습
 */
public class SelectTest {
	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/studydb"; //마지막 접속 데이터베이스명
		String user = "root";
		String pass = "1234";
		
		//결과처리 리스트 생성
		List<User1VO> user1s = new ArrayList<>();
		
		try {
			//1단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			
			//2단계 - SQL 실행 객체 생성
			Statement stmt = conn.createStatement();
			
			//3단계 - SQL 실행
			String sql = "select * from `user1` ";
			ResultSet rs = stmt.executeQuery(sql); //select 문은 executeQuery()로 실행
			
			//4단계 - ResultSet 결과 처리
			while(rs.next()) { //next가 트루일 경우 > 테이블에서 커서가 내려갈 데이터가 있음 > 데이터가 없으면 false
				
				//조회된 데이터 갯수(튜플) 만큼 커서를 한 행씩 내려가면서 데이터 조회
				String 	uid 	= rs.getString(1);
				String 	name 	= rs.getString(2);
				String 	birth 	= rs.getString(3);
				String 	hp 		= rs.getString(4);
				int 	age 	= rs.getInt(5);
				
				//리스트 생성
				User1VO vo = new User1VO();
				vo.setUid(uid);
				vo.setName(name);
				vo.setBirth(birth);
				vo.setHp(hp);
				vo.setAge(age);
				
				user1s.add(vo);
			}
			
			//5단계 - 접속종료
			rs.close(); //스트림 자원은 close해주어야 함
			stmt.close();
			conn.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		//리스트 출력
		for(User1VO vo : user1s) {
			System.out.println(vo);
		}
		System.out.println("select 완료...");
	}
}
