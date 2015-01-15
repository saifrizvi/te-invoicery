/**
 * Name			 : InvoicingService.java
 * Description	 : 
 * Creation Date : Dec 23, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service;

import java.util.List;

import com.invoicery.service.vo.CustomerSelection;
import com.invoicery.service.vo.Invoice;
import com.invoicery.service.vo.ItemSelection;

public interface InvoicingService {
	
	public boolean sendInvoice(Invoice invoice);
	
	public List<CustomerSelection> getAvailableCustomers();
	
	public CustomerSelection getCustomerSelection(long customerId);
	
	public List<ItemSelection> getAvailableItems();
	
	public ItemSelection getItemSelection(long itemId);
}
