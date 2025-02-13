package org.dnyanyog.dto;

public class AddProductRequest {
	protected String pname;
	protected Integer pqty;
	protected Integer pprc;

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getPqty() {
		return pqty;
	}

	public void setPqty(Integer pqty) {
		this.pqty = pqty;
	}

	public Integer getPprc() {
		return pprc;
	}

	public void setPprc(Integer pprc) {
		this.pprc = pprc;
	}

//	public AddProductRequest(int pid,String pname,int pqty, int pprc) {
//		this.pid = pid;
//		this.pname = pname;
//		this.pqty = pqty;
//		this.pprc = pprc;
//	}
//	
//public boolean addProductIntoDb() throws SQLException {
//		
//	String query = "insert into product(product_Id,product_name , product_qty, product_prc)values('"+pid+"','" + pname
//			+ "', '" + pqty + "', '" + pprc + "')";
//		
//		int rowsInserted= DbUtils.executeQuery(query);
//		return rowsInserted>0;
//	
//	}
}
