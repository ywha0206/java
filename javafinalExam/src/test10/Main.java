package test10;

import java.util.List;

/*
 * 날짜: 2024/08/01
 * 이름: 박연화
 * 내용: 자바 총정리 문제
 */
public class Main {
	public static void main(String[] args) {
		
		//쇼핑몰 생성
		ShoppingMall shoppingMall = new ShoppingMall();
		
		//고객 생성
		Customer customer1 = new Customer("A101", "김유신");
		Customer customer2 = new Customer("A102", "김춘추");
		
		//고객 추가
		shoppingMall.addCustomer(customer1);
		shoppingMall.addCustomer(customer2);
		
		//제품 생성
		Product tshirt = new Clothes("티셔츠", 15000);
		Product orange = new Food("오렌지", 3000);
		Product banana = new Food("바나나", 3500);
		
		//주문 생성
		Order order1 = new Order(1, customer1);
		order1.addProduct(orange);
		order1.addProduct(tshirt);
		
		Order order2 = new Order(2, customer2);
		order2.addProduct(tshirt);
		order2.addProduct(banana);
		
		
		//주문 추가
		shoppingMall.addOrder(order1);
		shoppingMall.addOrder(order2);
		
		//모든 주문 출력
		List<Order> orders = shoppingMall.getOrders();
		
		for(Order order : orders) {
			System.out.println("주문번호 : "+order.getOrderNo());
			System.out.println("고객이름 : "+order.getCustomer().getName());
			System.out.println("주문금액 : ￦"+order.getTotalPrice());
			System.out.println("주문목록");
			for(Product product : order.getProducts()) {
				System.out.println(" - " + product.getName()+" ￦"+product.getPrice());
			}
			System.out.println();
		}
		
		
		
		
	}
}
