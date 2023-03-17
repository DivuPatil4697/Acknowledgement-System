package com.AcknowledgementModule.Entity;

public class orderItems {
	private int ordItemId;
	private int productNo;
	private String productName;
	private String productQuantity;
	private String ProductPrice;
	public int getOrdItemId() {
		return ordItemId;
	}
	public void setOrdItemId(int ordItemId) {
		this.ordItemId = ordItemId;
	}
	public int getProductNo() {
		return productNo;
	}
	public void setProductNo(int productNo) {
		this.productNo = productNo;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(String productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "orderItems [ordItemId=" + ordItemId + ", productNo=" + productNo + ", productName=" + productName
				+ ", productQuantity=" + productQuantity + ", ProductPrice=" + ProductPrice + "]";
	}
	public orderItems(int ordItemId, int productNo, String productName, String productQuantity, String productPrice) {
		super();
		this.ordItemId = ordItemId;
		this.productNo = productNo;
		this.productName = productName;
		this.productQuantity = productQuantity;
		ProductPrice = productPrice;
	}

}
