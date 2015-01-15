/**
 * Name			 : Company.java
 * Description	 : This is users company.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;


public class Company {
	
	private String companyName;
	private String companyRegistrationNumber;
	private String contactPersonName;
	private Address companyAdress;
	private String companyVATNumber;
	private long companyPhoneNumber;
	private String companyEmail;
	private BankAccount accountDetails;
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyRegistrationNumber() {
		return companyRegistrationNumber;
	}
	public void setCompanyRegistrationNumber(String companyRegistrationNumber) {
		this.companyRegistrationNumber = companyRegistrationNumber;
	}
	public String getContactPersonName() {
		return contactPersonName;
	}
	public void setContactPersonName(String contactPersonName) {
		this.contactPersonName = contactPersonName;
	}
	public Address getCompanyAdress() {
		return companyAdress;
	}
	public void setCompanyAdress(Address companyAdress) {
		this.companyAdress = companyAdress;
	}
	public String getCompanyVATNumber() {
		return companyVATNumber;
	}
	public void setCompanyVATNumber(String companyVATNumber) {
		this.companyVATNumber = companyVATNumber;
	}
	public long getCompanyPhoneNumber() {
		return companyPhoneNumber;
	}
	public void setCompanyPhoneNumber(long companyPhoneNumber) {
		this.companyPhoneNumber = companyPhoneNumber;
	}
	public String getCompanyEmail() {
		return companyEmail;
	}
	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public BankAccount getAccountDetails() {
		return accountDetails;
	}
	public void setAccountDetails(BankAccount accountDetails) {
		this.accountDetails = accountDetails;
	}
}
