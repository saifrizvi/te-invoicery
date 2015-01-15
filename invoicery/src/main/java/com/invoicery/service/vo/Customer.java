/**
 * Name			 : Customer.java
 * Description	 : This is the Customer that the creditor is going to bill to.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

import com.invoicery.common.CommonConstants.*;
public class Customer {
	
	private long customerId;
	private String customerName;
	private EntityType customerType;
	private Country nationality;
	private String nationalInsuranceNumber;
	private String customerVATNumber;
	private String customerEmail;
	private String customerPhoneNumber;
	private String recipientName;
	private Address customerAdress;
	
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
	public EntityType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(EntityType customerType) {
		this.customerType = customerType;
	}
	public Country getNationality() {
		return nationality;
	}
	public void setNationality(Country nationality) {
		this.nationality = nationality;
	}
	public String getNationalInsuranceNumber() {
		return nationalInsuranceNumber;
	}
	public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
		this.nationalInsuranceNumber = nationalInsuranceNumber;
	}
	public String getCustomerVATNumber() {
		return customerVATNumber;
	}
	public void setCustomerVATNumber(String customerVATNumber) {
		this.customerVATNumber = customerVATNumber;
	}
	public String getCustomerEmail() {
		return customerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}
	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}
	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}
	public String getRecipientName() {
		return recipientName;
	}
	public void setRecipientName(String recipientName) {
		this.recipientName = recipientName;
	}
	public Address getCustomerAdress() {
		return customerAdress;
	}
	public void setCustomerAdress(Address customerAdress) {
		this.customerAdress = customerAdress;
	}
	
}
