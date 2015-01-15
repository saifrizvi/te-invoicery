/**
 * Name			 : ItemSelectionEditor.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

import java.beans.PropertyEditorSupport;

import com.invoicery.service.InvoicingService;

public class ItemSelectionEditor extends PropertyEditorSupport {

	private InvoicingService invoiceService;
	
	public ItemSelectionEditor(InvoicingService invoiceService){
		this.invoiceService = invoiceService;
	}
	
	public void setAsText(String text){
		long itemId = Long.parseLong(text);
		ItemSelection itemSelection = invoiceService.getItemSelection(itemId);
		setValue(itemSelection);
	}
}
