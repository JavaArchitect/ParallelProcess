/*
 * @(#)CheckInventory.java		Jan 3, 2016	
 */
package com.process.parallel;

import java.util.Random;

/**
 *
 * @author  Prasad Nerayanuru
 */

class CheckInventory implements Runnable{
	
	private Order order;
	
	CheckInventory(Order order){
		this.order=order;
	}

	@Override
	public void run() {
		System.out.println("Checking Inventory Quantity->" + order.getQuantity() + " for order Id->" + order.getOrderId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int rNum = random.nextInt(2);
		boolean inventoryAvail = (rNum == 0) ? true : false;
		System.out.println("Inventory Available ->" + inventoryAvail);
		order.setInventory(inventoryAvail);
	}

}
