/**
 * Name			 : Invoice.java
 * Description	 : This will contain the detail of the invoice created by the user.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

import java.io.File;
import java.util.ArrayList;

public class Invoice {

	/** Required for invoice recording **/
	private long invoiceNumber;
	private Customer customer;
	private ArrayList<Item> itemList;
	private double totalAmount;
	private double totalVat;
	private double invoiceFee;
	private double discount;
	private String message;
	private File attachment;
	
	/**Required for Display **/
	private CustomerSelection customerSelection;
	private ItemSelection itemSelection;
	
	public Invoice(){
	}
	
	public long getInvoiceNumber() {
		return invoiceNumber;
	}
	public void setInvoiceNumber(long invoiceNumber) {
		this.invoiceNumber = invoiceNumber;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ArrayList<Item> getItemList() {
		return itemList;
	}
	public void setItemList(ArrayList<Item> itemList) {
		this.itemList = itemList;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getTotalVat() {
		return totalVat;
	}
	public void setTotalVat(double totalVat) {
		this.totalVat = totalVat;
	}
	public double getInvoiceFee() {
		return invoiceFee;
	}
	public void setInvoiceFee(double invoiceFee) {
		this.invoiceFee = invoiceFee;
	}
	public double getDiscount() {
		return discount;
	}
	public void setDiscount(double discount) {
		this.discount = discount;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public File getAttachment() {
		return attachment;
	}
	public void setAttachment(File attachment) {
		this.attachment = attachment;
	}

	public CustomerSelection getCustomerSelection() {
		return customerSelection;
	}

	public void setCustomerSelection(CustomerSelection customerSelection) {
		this.customerSelection = customerSelection;
	}

	public ItemSelection getItemSelection() {
		return itemSelection;
	}

	public void setItemSelection(ItemSelection itemSelection) {
		this.itemSelection = itemSelection;
	}
	
	
}
