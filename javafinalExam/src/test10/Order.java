package test10;

import java.util.ArrayList;
import java.util.List;

public class Order {
	
	private int orderNo;
	private Customer customer;
	private List<Product> products = new ArrayList<>();
	private int totalPrice = 0;
	
	public Order(int orderNo, Customer customer) {
		this.orderNo = orderNo;
		this.customer = customer;
	}

	public int getOrderNo() {
		return orderNo;
	}

	public Customer getCustomer() {
		return customer;
	}

	public List<Product> getProducts() {
		products.add(product);
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void addProduct(Product product) {
		products.add(product);
	}
}
