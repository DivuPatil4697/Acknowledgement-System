package com.AcknowledgementModule.Entity;

import java.time.LocalDate;

public class OrderHeader {
	private int ordId;
	private String userName;
	private String userMobileNo;
	private LocalDate purchaseOrdDate;
	private orderItems orderItems;
	private address address;
	public int getOrdId() {
		return ordId;
	}
	public void setOrdId(int ordId) {
		this.ordId = ordId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserMobileNo() {
		return userMobileNo;
	}
	public void setUserMobileNo(String userMobileNo) {
		this.userMobileNo = userMobileNo;
	}
	public LocalDate getPurchaseOrdDate() {
		return purchaseOrdDate;
	}
	public void setPurchaseOrdDate(LocalDate purchaseOrdDate) {
		this.purchaseOrdDate = purchaseOrdDate;
	}
	public orderItems getOrderItems() {
		return orderItems;
	}
	public void setOrderItems(orderItems orderItems) {
		this.orderItems = orderItems;
	}
	public address getAddress() {
		return address;
	}
	public void setAddress(address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "OrderHeader [ordId=" + ordId + ", userName=" + userName + ", userMobileNo=" + userMobileNo
				+ ", purchaseOrdDate=" + purchaseOrdDate + ", orderItems=" + orderItems + ", address=" + address + "]";
	}
	public OrderHeader(int ordId, String userName, String userMobileNo, LocalDate purchaseOrdDate,
			com.AcknowledgementModule.Entity.orderItems orderItems, com.AcknowledgementModule.Entity.address address) {
		super();
		this.ordId = ordId;
		this.userName = userName;
		this.userMobileNo = userMobileNo;
		this.purchaseOrdDate = purchaseOrdDate;
		this.orderItems = orderItems;
		this.address = address;
	}
	
	

}
