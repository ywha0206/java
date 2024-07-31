package shop.dao;

import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.ProductVo;

public class ProductDao extends DBHelper{

	//싱글톤
	private static ProductDao instance = new ProductDao();
	public static ProductDao getInstance() {
		return instance;
	}
	private ProductDao() {}
	
	//기본 CRUD 메서드
	public ProductVo selectProduct(String prodNo) {
		ProductVo vo = null;
		try {
			 conn = getConnection();
			 psmt = conn.prepareStatement(SQL.SELECT_PRODUCT);
			 psmt.setString(1, prodNo);
			 rs = psmt.executeQuery();
			 
			 if(rs.next()) {
				 vo = new ProductVo();
				 vo.setProdNo(rs.getInt(1));
				 vo.setName(rs.getString(2));
				 vo.setStock(rs.getInt(3));
				 vo.setPrice(rs.getInt(4));
				 vo.setCompany(rs.getString(5));
			 }
			 closeAll();
			 
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	public List<ProductVo> selectProducts() {
		return null;
	}
	public void updateProduct() {
		
	}
	public void deleteProduct() {
		
	}
	
	
}
