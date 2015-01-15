/**
 * Name			 : InvoiceBindingInitializer.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.web;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import com.invoicery.service.InvoicingService;
import com.invoicery.service.vo.CustomerSelection;
import com.invoicery.service.vo.CustomerSelectionEditor;
import com.invoicery.service.vo.ItemSelection;
import com.invoicery.service.vo.ItemSelectionEditor;
/**
 * 
 */
public class InvoiceBindingInitializer implements WebBindingInitializer {

	private InvoicingService invoicingService;
	
	@Autowired
	public InvoiceBindingInitializer(InvoicingService invoicingService) {
		this.invoicingService = invoicingService;
	}
	
	@Override
	public void initBinder(WebDataBinder binder, WebRequest request) {
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		dateFormat.setLenient(false);
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
		binder.registerCustomEditor(CustomerSelection.class, new CustomerSelectionEditor(invoicingService));
		binder.registerCustomEditor(ItemSelection.class, new ItemSelectionEditor(invoicingService));
	}

}
