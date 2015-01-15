/**
 * Name			 : Item
 * Description	 : This is the item that the creditor is going to bill the customer for.
 * Creation Date : 12/23/2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

import com.invoicery.common.CommonConstants.*;

public class Item {
	
	private long itemNumber;
	private String itemName;
	private String itemDescription;
	private Unit itemUnit;
	private double amount;
	private double netPrice;
	private double vat;
	private double sum;
	
	public long getItemNumber() {
		return itemNumber;
	}
	public void setItemNumber(long itemNumber) {
		this.itemNumber = itemNumber;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public Unit getItemUnit() {
		return itemUnit;
	}
	public void setItemUnit(Unit itemUnit) {
		this.itemUnit = itemUnit;
	}
	public double getNetPrice() {
		return netPrice;
	}
	public void setNetPrice(double netPrice) {
		this.netPrice = netPrice;
	}
	public double getVat() {
		return vat;
	}
	public void setVat(double vat) {
		this.vat = vat;
	}
	public double getSum() {
		return sum;
	}
	public void setSum(double sum) {
		this.sum = sum;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
}
