package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

/*
 * 날짜: 2024/07/30
 * 이름: 박연화
 * 내용: 트랜잭션 실습하기
 */
public class TransactionTest {
	//final : 상수, 대문자 표기가 관례
	private final static String HOST = "jdbc:mysql://localhost:3306/bank";
	private final static String USER = "root";
	private final static String PASS = "1234";
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("에러를 발생 하시겠습니까?");
		
		int answer = scan.nextInt();
		
		Connection conn = null;
		
		try {
			//1단계 데이터베이스 접속
			conn = DriverManager.getConnection(HOST, USER, PASS);
			
			//트랜잭션 시작
			conn.setAutoCommit(false); //오토 커밋 모드를 꺼야 함
			
			String sql1 = "update `bank_account` set `a_balance` = `a_balance` - 10000 where `a_no` = ?";
			String sql2 = "update `bank_account` set `a_balance` = `a_balance` + 10000 where `a_no` = ?";
			
			PreparedStatement psmt1 = conn.prepareStatement(sql1);
			psmt1.setString(1, "101-11-1001"); //1 > 쿼리 파라미터 순서 번호 = sql1의 물음표 갯수 중에 순서
			
			PreparedStatement psmt2 = conn.prepareStatement(sql2);
			psmt2.setString(1, "101-11-1003");
			
			
			// 하나의 작업으로 묶어야 함
			psmt1.executeUpdate(); //sql 실행
			
			if(answer ==1) {
				throw new Exception("에러가 발생했습니다.");
			}
			
			psmt2.executeUpdate(); 
			//하나의 작업으로 묶어야 함
			
			//트랜잭션 수동 커밋(작업 확정)
			conn.commit();
			
			psmt1.close();
			psmt2.close();
			conn.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
			
			try {
				//트랜잭션 취소(작업 실패 처리)
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			
		}
		System.out.println("트랜잭션 완료...");
	}
}
