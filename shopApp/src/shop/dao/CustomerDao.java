package shop.dao;

import java.util.List;

import shop.db.DBHelper;
import shop.db.SQL;
import shop.vo.CustomerVo;

public class CustomerDao extends DBHelper{
	
	//싱글톤
	private static CustomerDao instance = new CustomerDao();
	public static CustomerDao getInstance() {
		return instance;
	}
	private CustomerDao() {}
	
	//기본 CRUD 메서드
	public int insertCustomer(CustomerVo vo) {
		
		int count = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			count = psmt.executeUpdate();
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return count;
	}
	
	public CustomerVo selectCustomer(String custId) {
		
		CustomerVo vo = null;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			rs = psmt.executeQuery();
			
			if(rs.next()) {
				vo = new CustomerVo();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			closeAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	public List<CustomerVo> selectCustomers() {
		return null;
	}
	
	public int updateCustomer(CustomerVo vo) {
		return 0;
	}
	
	public int deleteCustomer(String custId) {
		return 0;
	}
	
	
}
