/**
 * Name			 : CustomerSelection.java
 * Description	 : This value object will be used to retrieve the existing customers for the user available for selection on create invoice page.
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

public class CustomerSelection {

	private long customerId;
	private String customerName;
	
	public CustomerSelection(long customerSelectionId, String customerSelectionName){
		this.customerId = customerSelectionId;
		this.customerName = customerSelectionName;
	}

	public long getCustomerId() {
		return customerId;
	}

	public void setCustomerId(long customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
}
