/*
 * @(#)CreditCardTask.java		Jan 3, 2016	
 */
package com.process.parallel;

import java.util.Random;

/**
 *
 * @author  Prasad Nerayanuru
 */

class CreditCardTask implements Runnable{
	
	private Order order;

	CreditCardTask(Order order){
		this.order = order;
	}
	
	@Override
	public void run() {
		System.out.println("Checking Credit for Order Id->" + order.getOrderId());
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		Random random = new Random();
		int rNum = random.nextInt(2);
		boolean creditAvail = (rNum == 0) ? true : false;
		System.out.println("Credit Available ->" + creditAvail);
		order.setCreditCheck(creditAvail);
	}

}
