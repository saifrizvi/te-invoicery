/**
 * Name			 : InvoicingServiceImpl.java
 * Description	 : 
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */

package com.invoicery.service;

import static com.invoicery.common.CommonConstants.CUSTOMER_ID;
import static com.invoicery.common.CommonConstants.CUSTOMER_NAME;
import static com.invoicery.common.CommonConstants.ITEM_NAME;
import static com.invoicery.common.CommonConstants.ITEM_NUMBER;
import static com.invoicery.common.CommonConstants.SELECT_CUSTOMER;
import static com.invoicery.common.CommonConstants.SELECT_ITEMS;
import static com.invoicery.common.CommonConstants.customerFields;
import static com.invoicery.common.CommonConstants.itemFields;
import static com.invoicery.common.Utils.lookupInd;

import java.util.ArrayList;
import java.util.List;

import jxl.Cell;
import jxl.Sheet;

import com.invoicery.dao.BaseDAO;
import com.invoicery.service.vo.CustomerSelection;
import com.invoicery.service.vo.Invoice;
import com.invoicery.service.vo.ItemSelection;

public class InvoicingServiceImpl implements InvoicingService {

	private Invoice invoice;
	private BaseDAO baseDAO;
	
	//TODO Change the constructor on final implementation
	public InvoicingServiceImpl(){
		invoice = new Invoice();
		baseDAO = new BaseDAO();
	} 

	@Override
	public CustomerSelection getCustomerSelection(long customerId) {
		List<CustomerSelection> availableCustomers = getAvailableCustomers();
		
		CustomerSelection returnCustomer = null;
		for (CustomerSelection customerSelection : availableCustomers) {
			if(customerSelection.getCustomerId() == customerId){
				returnCustomer = customerSelection;
			}
		}
		return returnCustomer;
	}
	
	@Override
	public ItemSelection getItemSelection(long itemId) {
		List<ItemSelection> availableItems = getAvailableItems();
		
		ItemSelection returnItem = null;
		for (ItemSelection itemSelection : availableItems) {
			if(itemSelection.getItemId() == itemId){
				returnItem = itemSelection;
			}
		}
		return returnItem;
	}
	
	@Override
	public List<CustomerSelection> getAvailableCustomers() {
		
		List<CustomerSelection> availableCustomers = new ArrayList<CustomerSelection>();
		availableCustomers.add(new CustomerSelection(0,SELECT_CUSTOMER));
		
		Sheet customerTblSheet = baseDAO.getCustomerTblSheet();
		
		if(null != customerTblSheet){
			int rows = customerTblSheet.getRows();
			
			for (int row = rows-1; row > 0; row--) {
				Cell customerIdCell = customerTblSheet.getCell(lookupInd(customerFields, CUSTOMER_ID), row);
				Cell customerNameCell = customerTblSheet.getCell(lookupInd(customerFields, CUSTOMER_NAME), row);
				if (null != customerIdCell && null != customerNameCell) {
					String customerIdContents = customerIdCell.getContents();
					if (null != customerIdContents && !customerIdContents.isEmpty()) {
						availableCustomers.add(new CustomerSelection(new Long(customerIdContents), customerNameCell.getContents()));
					}
				}
			}
		}
		
		return availableCustomers;
	}
	

	@Override
	public List<ItemSelection> getAvailableItems() {
		
		List<ItemSelection> availableItems = new ArrayList<ItemSelection>();
		availableItems.add(new ItemSelection(0,SELECT_ITEMS));
		
		Sheet itemTblSheet = baseDAO.getItemTblSheet();
		
		if(null != itemTblSheet){
			int rows = itemTblSheet.getRows();
			
			for (int row = rows-1; row > 0; row--) {
				Cell itemIdCell = itemTblSheet.getCell(lookupInd(itemFields, ITEM_NUMBER), row);
				Cell itemNameCell = itemTblSheet.getCell(lookupInd(itemFields, ITEM_NAME), row);
				if (null != itemIdCell && null != itemNameCell) {
					String itemIdContents = itemIdCell.getContents();
					if (null != itemIdContents && !itemIdContents.isEmpty()) {
						availableItems.add(new ItemSelection(new Long(itemIdContents), itemNameCell.getContents()));
					}
				}
			}
		}
		
		return availableItems;
	}
	
	
	@Override
	public boolean sendInvoice(Invoice invoice) {
		
		boolean success = true;
		/**
		 * Create an invoice
		 */
		success = createInvoice(invoice);
		
		/**
		 * Save the invoice in the backend. 
		 */
		success = saveInvoice();
		
		/**
		 * Send the invoice in an email
		 */
		success = emailInvoice();
		
		return success;
	}

	
	//TODO Implement
	/**
	 * This method will create the invoice from the web response from the user.
	 * @param customer
	 * @param itemList
	 * @param invoiceFee
	 * @param discount
	 * @param message
	 * @param attachment
	 */
	private boolean createInvoice(Invoice invoice) {
		
		this.invoice = invoice;
		
		return true;
		
	}

	//TODO Implement
	/**
	 * This method will persist the invoice in the database
	 * @return
	 */
	private boolean saveInvoice() {
	
		return true;
		
	}

	//TODO Implement
	/**
	 * This method will send the email invoice to the customer
	 * @return
	 */
	private boolean emailInvoice() {
		
		return true;
		
	}

	/**
	 * 
	 * @param invoice
	 */
	public void setInvoice(Invoice invoice) {
		
		this.invoice = invoice;
		
	}
	
	public BaseDAO getBaseDAO() {
		return baseDAO;
	}

	public void setBaseDAO(BaseDAO baseDAO) {
		this.baseDAO = baseDAO;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	/**
	 * For testing
	 */

	public static void main(String args[]){
		InvoicingServiceImpl test = new InvoicingServiceImpl();
		
//		System.out.println(test.getCustomerSelection(2002).getCustomerName());
//		
//		List<CustomerSelection> availableCustomers = test.getAvailableCustomers();
//		
//		for (CustomerSelection customerSelection : availableCustomers) {
//			System.out.println(customerSelection.getCustomerId());
//			System.out.println(customerSelection.getCustomerName());
//		}
		
		
		System.out.println(test.getItemSelection(1002).getItemName());
		
		List<ItemSelection> availableCustomers = test.getAvailableItems();
		
		for (ItemSelection itemSelection : availableCustomers) {
			System.out.println(itemSelection.getItemId());
			System.out.println(itemSelection.getItemName());
		}
	}

}
