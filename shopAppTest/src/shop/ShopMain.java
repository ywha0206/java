package shop;

import java.util.Scanner;

import shop.dao.CustomerDao;
import shop.vo.CustomerVo;

/*
 * 날짜: 2024/07/31
 * 이름: 박연화
 * 내용: Shop 미니 프로젝트 실습하기
 */
public class ShopMain {
	public static void main(String[] args) {
		
		System.out.println("------------------------");
		System.out.println("쇼핑몰에 오신 것을 환영합니다.");
		System.out.println("------------------------");
		
		Scanner sc = new Scanner(System.in);
		
		CustomerDao customerDao = CustomerDao.getInstance();
		
		//로그인 사용자 객체
		CustomerVO loginedCustomer = null;
		
		while(true) {
			
			if(loginedCustomer == null) {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			}else {
				System.out.println("종료:0, 로그인:1, 회원가입:2, 상품목록:3, 주문하기:4");
			}
			System.out.print("선택 > ");
			
			
			int answer = sc.nextInt();
			sc.nextLine();
			
			
			if(answer == 0) {
				break;
			}else if(answer == 1) {
				
				if(loginedCustomer == null) {
					// 로그인
					System.out.print("아이디 입력 : ");
					String custId = sc.next();
					
					loginedCustomer = customerDao.selectCustomer(custId);
					
					if(loginedCustomer != null) {
						System.out.println(loginedCustomer.getName() + "님 어서오세요.");
					}else {
						System.out.println("일치하는 회원이 없습니다.");
					}
				}else {
					// 로그아웃
					System.out.println(loginedCustomer.getName() + "님 안녕히 가세요.");
					loginedCustomer = null;
				}
			
				
			}else if(answer == 2) {
				//회원가입
				CustomerVo custVo = new CustomerVo();
				
				System.out.print("아이디 입력: ");
				custVo.setCustId(sc.nextLine());
				
				System.out.print("이름 입력: ");
				custVo.setName(sc.nextLine());
				
				System.out.print("휴대폰 입력: ");
				custVo.setHp(sc.nextLine());
				
				System.out.print("주소 입력: ");
				custVo.setAddr(sc.nextLine());
				
				int result = customerDao.insertCustomer(custVo);
				
				if(result > 0) {
					System.out.println("회원가입을 축하합니다.");
				}else {
					System.out.println("회원가입에 실패했습니다.");
				}
				
				
			}else if(answer == 3) {
				//상품목록
				
				
			}else if(answer == 4) {
				//주문하기
				
				
			}
			
			
		}//end while
		
		sc.close();
		System.out.println("안녕히 가십시오.");
	}
}
