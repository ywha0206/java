package user2;

import java.util.List;
import java.util.Scanner;

public class User2Main {
	public static void main(String[] args) {
		
		System.out.println("------------------------------");
		System.out.println("User2 회원 관리 매니저");
		System.out.println("------------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("종료:0, 입력:1, 조회:2, 검색:3, 수정:4, 삭제:5");
			System.out.print("선택> ");
			
			int answer = sc.nextInt();
			sc.nextLine();
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				System.out.print("아이디 입력: ");
				String uid = sc.next();
				
				System.out.print("이름 입력: ");
				String name = sc.next();
				
				System.out.print("생년월일 입력: ");
				String birth = sc.next();
				sc.nextLine();
				
				System.out.print("주소 입력: ");
				String addr = sc.nextLine();
				
				User2VO vo = new User2VO(uid, name, birth, addr);
				
				User2DAO dao = User2DAO.getInstance();
				dao.insertUser(vo);
				
				System.out.println("입력 완료...");
				
			}else if(answer==2) {
				List<User2VO> users = User2DAO.getInstance().selectUsers();
				
				for(User2VO user: users) {
					System.out.println(user);
				}
				
			}else if(answer==3) {
				
				System.out.print("검색 아이디: ");
				String searchUid = sc.next();
				
				User2VO user = User2DAO.getInstance().selectUser(searchUid);
				
				System.out.println(user);
				
			}else if(answer==4) {
				
				User2VO user = new User2VO();
				
				System.out.print("수정 회원 아이디 입력: ");
				user.setUid(sc.next());
				
				System.out.print("수정 회원 이름 입력: ");
				user.setName(sc.next());
				
				System.out.print("수정 회원 생년월일 입력: ");
				user.setBirth(sc.next());
				sc.nextLine();
				
				System.out.print("수정 회원 주소 입력: ");
				user.setAddr(sc.nextLine());
				
				User2DAO.getInstance().updateUser(user);
				System.out.println("수정완료...");
				
			}else if(answer==5) {
				
			}
			
		}//while
		
		sc.close();
		System.out.println("회원 관리 매니저를 종료합니다.");
		
	}//main
}
