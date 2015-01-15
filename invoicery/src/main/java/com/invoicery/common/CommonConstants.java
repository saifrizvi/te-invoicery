/**
 * Name			 : CommonConstants.java
 * Description	 : This class is used to contain all the constants to be used commonly across the project.
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.common;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class CommonConstants {

	/**
	 * Object Model constants
	 */
	public enum Unit {
	    LITRE, HOUR, TONNE, MM, M2,METRE, MONTH,KM,M3,KG,DAY,PCS,GRAM; 
	}
	
	public enum EntityType {
	    BUSINESS, INDIVIDUAL; 
	}
	
	public enum Country {
	    UNITED_KINGDOM, FOREIGN; 
	}
	
	
	/**
	 * Datasource constants
	 */
	public static final String SPREADSHEET_ITEM = "Item";
	public static final String SPREADSHEET_CUSTOMER = "Customer";
	public static final String SPREADSHEET_INVOICE = "Invoice";
	public static final String DATA_STORE_PATH = "C:/MyWS/invoicery/src/main/resources/InvoicingDataStore.xls";//"src/main/resources/InvoicingDataStore.xls";
	
	public static final String ATTACHMENT = "attachment";
	public static final String MESSAGE = "message";
	public static final String DISCOUNT = "discount";
	public static final String INVOICE_FEE = "invoiceFee";
	public static final String TOTAL_VAT = "totalVat";
	public static final String TOTAL_AMOUNT = "totalAmount";
	public static final String ITEM_LIST = "itemList";
	public static final String CUSTOMER = "customer";
	public static final String INVOICE_NUMBER = "invoiceNumber";
	public static final String SUM = "sum";
	public static final String VAT = "vat";
	public static final String NET_PRICE = "netPrice";
	public static final String AMOUNT = "amount";
	public static final String ITEM_UNIT = "itemUnit";
	public static final String ITEM_DESCRIPTION = "itemDescription";
	public static final String ITEM_ID = "itemId";
	public static final String ITEM_NAME = "itemName";
	public static final String ITEM_NUMBER = "itemNumber";
	public static final String CUSTOMER_ADRESS = "customerAdress";
	public static final String RECIPIENT_NAME = "recipientName";
	public static final String CUSTOMER_PHONE_NUMBER = "customerPhoneNumber";
	public static final String CUSTOMER_EMAIL = "customerEmail";
	public static final String CUSTOMER_VAT_NUMBER = "customerVATNumber";
	public static final String NATIONAL_INSURANCE_NUMBER = "nationalInsuranceNumber";
	public static final String NATIONALITY = "nationality";
	public static final String CUSTOMER_TYPE = "customerType";
	public static final String S_NO = "s.no.";
	public static final String CUSTOMER_NAME = "customerName";
	public static final String CUSTOMER_ID = "customerId";
	public static final String SELECT_CUSTOMER = " - Select Customer - ";
	public static final String SELECT_ITEMS = " - Select Item - ";

	
	public static Map<String, Integer> invoiceFields = new HashMap<String, Integer>();
	public static Map<String, Integer> customerFields = new HashMap<String, Integer>();
	public static Map<String, Integer> itemFields = new HashMap<String, Integer>();
	
	static{
		Map<String, Integer> tmpMap1 = new HashMap<String, Integer>();
		
		tmpMap1.put(S_NO, new Integer(0));
		tmpMap1.put(INVOICE_NUMBER, new Integer(1));
		tmpMap1.put(CUSTOMER, new Integer(2));
		tmpMap1.put(ITEM_LIST, new Integer(3));
		tmpMap1.put(TOTAL_AMOUNT, new Integer(4));
		tmpMap1.put(TOTAL_VAT, new Integer(5));
		tmpMap1.put(INVOICE_FEE, new Integer(6));
		tmpMap1.put(DISCOUNT, new Integer(7));
		tmpMap1.put(MESSAGE, new Integer(8));
		tmpMap1.put(ATTACHMENT, new Integer(9));
		
		invoiceFields = Collections.unmodifiableMap(tmpMap1);
		
		Map<String, Integer> tmpMap2 = new HashMap<String, Integer>();
		
		tmpMap2.put(S_NO, new Integer(0));
		tmpMap2.put(CUSTOMER_ID, new Integer(1));
		tmpMap2.put(CUSTOMER_NAME, new Integer(2));
		tmpMap2.put(CUSTOMER_TYPE, new Integer(3));
		tmpMap2.put(NATIONALITY, new Integer(4));
		tmpMap2.put(NATIONAL_INSURANCE_NUMBER, new Integer(5));
		tmpMap2.put(CUSTOMER_VAT_NUMBER, new Integer(6));
		tmpMap2.put(CUSTOMER_EMAIL, new Integer(7));
		tmpMap2.put(CUSTOMER_PHONE_NUMBER, new Integer(8));
		tmpMap2.put(RECIPIENT_NAME, new Integer(9));
		tmpMap2.put(CUSTOMER_ADRESS, new Integer(10));
		
		customerFields = Collections.unmodifiableMap(tmpMap2);
		
		Map<String, Integer> tmpMap3 = new HashMap<String, Integer>();
		
		tmpMap3.put(S_NO, new Integer(0));
		tmpMap3.put(ITEM_NUMBER, new Integer(1));
		tmpMap3.put(ITEM_NAME, new Integer(2));
		tmpMap3.put(ITEM_DESCRIPTION, new Integer(3));
		tmpMap3.put(ITEM_UNIT, new Integer(4));
		tmpMap3.put(AMOUNT, new Integer(5));
		tmpMap3.put(NET_PRICE, new Integer(6));
		tmpMap3.put(VAT, new Integer(7));
		tmpMap3.put(SUM, new Integer(8));
		
		itemFields = Collections.unmodifiableMap(tmpMap3);

	}
	
}
