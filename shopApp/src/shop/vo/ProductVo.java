package shop.vo;

public class ProductVo {
	private int prodNo;
	private String name;
	private int stock;
	private int price;
	private String company;
	
	public ProductVo() {
	}

	public ProductVo(int prodNo, String name, int stock, int price, String company) {
		this.prodNo = prodNo;
		this.name = name;
		this.stock = stock;
		this.price = price;
		this.company = company;
	}
	
	public int getProdNo() {
		return prodNo;
	}
	public void setProdNo(int prodNo) {
		this.prodNo = prodNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "prodNo=" + prodNo + ", name=" + name + ", stock=" + stock + ", price=" + price + ", company="
				+ company + "";
	}
	
	
	
}
