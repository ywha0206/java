package shop.db;

public class SQL {
	
	//customer
	public static final String INSERT_CUSTOMER = "INSERT INTO `customer` (`custId`, `name`, `hp`, `addr`, `rdate`) VALUES (?, ?, ?, ?, NOW())";
	
	public static final String SELECT_CUSTOMER = "SELECT * FROM `customer` WHERE `custId` = ?";
	
	public static final String SELECT_CUSTOMERS = "SELECT * FROM `customer`";
	
	public static final String UPDATE_CUSTOMER = "UPDATE `customer` SET `name` = ?, `hp` = ?, `addr` = ? WHERE `custId` = ?";
	
	public static final String DELETE_CUSTOMER = "DELETE FROM `customer` WHERE `custId` = ?";
	
	//order
	
	//product
	public static final String SELECT_PRODUCT = "select * from `product` where `prodNo` = ?";
	public static final String SELECT_PRODUCTS = "select * from `product`";
}
