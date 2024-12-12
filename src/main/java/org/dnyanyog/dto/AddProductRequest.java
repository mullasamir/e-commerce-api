package org.dnyanyog.dto;

import java.sql.SQLException;

import org.dnyanyog.common.DbUtils;

public class AddProductRequest {
	public int pid;
	public String pname;
	public int pqty;
	public int pprc;

	public AddProductRequest(int pid,String pname,int pqty, int pprc) {
		this.pid = pid;
		this.pname = pname;
		this.pqty = pqty;
		this.pprc = pprc;
	}
	
public boolean addProductIntoDb() throws SQLException {
		
	String query = "insert into product(product_Id,product_name , product_qty, product_prc)values('"+pid+"','" + pname
			+ "', '" + pqty + "', '" + pprc + "')";
		
		int rowsInserted= DbUtils.executeQuery(query);
		return rowsInserted>0;
	
	}
}
