package test07;

public class Clothes extends Product {
	private String size;

	public Clothes (String prodId, String prodName, int price, int quantity, String size) {
		super(prodId, prodName, price, quantity);
		this.size = size;
	}
	
	public void printProductInfo() {
		super.printProductInfo();
		System.out.println("제조사: "+size);
	}
}
