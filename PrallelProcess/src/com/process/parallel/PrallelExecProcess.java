/*
 * @(#)PrallelExecProcess.java		Jan 3, 2016	
 */
package com.process.parallel;

import java.util.Random;

/**
 * Order processing can be split into 2 parallel activities to fulfill the order.
 * 
 *  1)Checking Inventory
 *  2) Credit availability
 *  
 *  if both Inventory and Credit available Ok, calculate shipping and provide order total
 *  if one of them not Ok, then stop the order processing. 
 *
 * @author  Prasad Nerayanuru
 */

public class PrallelExecProcess {
	
	/**
	 * Process the order by executing 2 threads in parallel.
	 * 
	 * @param order
	 */
	private void processOrder(Order order) {
		CheckInventory checkInventory = new CheckInventory(order);
		CreditCardTask creditTask = new CreditCardTask(order);
		Thread invThread = new Thread(checkInventory);
		Thread creditThread = new Thread(creditTask);
		invThread.start();
		creditThread.start();
		try {
			invThread.join();
			creditThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		if(order.isInventory() && order.isCreditCheck()){
			System.out.println("Calculating Shipping, and processing order to fulfill");
		}else{
			System.out.println("Inventory or Credit Check failed, stopping the order processing further");
		}
	}
	
	/**
	 * Creates the Order object with random values.
	 * 
	 * @return
	 */
	private Order createOrder() {
		Order order = new Order();
		Random random = new Random();
		order.setOrderId(random.nextInt(1000));
		order.setQuantity(random.nextInt(100));
		order.setItemPrice(random.nextInt(30));
		return order;
	}

	//Main method
	public static void main(String[] args){
		PrallelExecProcess parallelProcess = new PrallelExecProcess();
		Order order = parallelProcess.createOrder();
		parallelProcess.processOrder(order);
	}

}
