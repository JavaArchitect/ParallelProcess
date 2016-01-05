/*
 * @(#)Order.java		Jan 3, 2016	
 */
package com.process.parallel;

/**
 *
 * @author  Prasad Nerayanuru
 */

public class Order {
	
	private int orderId;
	private int quantity;
	private int itemPrice;
	private double totalAmount;
	private boolean isCreditCheck;
	private boolean isInventory;
	private double shippingCharge;

	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(int itemPrice) {
		this.itemPrice = itemPrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public boolean isCreditCheck() {
		return isCreditCheck;
	}
	public void setCreditCheck(boolean isCreditCheck) {
		this.isCreditCheck = isCreditCheck;
	}
	public boolean isInventory() {
		return isInventory;
	}
	public void setInventory(boolean isInventory) {
		this.isInventory = isInventory;
	}
	public double getShippingCharge() {
		return shippingCharge;
	}
	public void setShippingCharge(double shippingCharge) {
		this.shippingCharge = shippingCharge;
	}

}
