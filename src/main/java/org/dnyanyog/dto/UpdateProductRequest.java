package org.dnyanyog.dto;

public class UpdateProductRequest {

	private String pname;
	private Integer pqty;
	private Integer pprc;
	private Integer product_id;

	public String getPname() {
		return pname;
	}

	public Integer getProduct_id() {
		return product_id;
	}

	public void setProduct_id(Integer product_id) {
		this.product_id = product_id;
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

}
