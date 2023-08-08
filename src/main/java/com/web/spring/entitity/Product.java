package com.web.spring.entitity;

public class Product {

	private int productid;
	private String productname;
	private float productprice;
	private int productqty;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int productid, String productname, float productprice, int productqty) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productprice = productprice;
		this.productqty = productqty;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public float getProductprice() {
		return productprice;
	}
	public void setProductprice(float productprice) {
		this.productprice = productprice;
	}
	public int getProductqty() {
		return productqty;
	}
	public void setProductqty(int productqty) {
		this.productqty = productqty;
	}
}
