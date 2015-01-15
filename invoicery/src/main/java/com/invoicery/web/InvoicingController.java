/**
 * Name			 : InvoicingController.java
 * Description	 : 
 * Creation Date : Dec 24, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.invoicery.service.InvoicingService;
import com.invoicery.service.vo.CustomerSelection;
import com.invoicery.service.vo.Invoice;
import com.invoicery.service.vo.Item;
import com.invoicery.service.vo.ItemSelection;

@Controller
@RequestMapping("/createInvoice")
@SessionAttributes("invoice")
public class InvoicingController {

	private InvoicingService invoiceService;
	
	@Autowired
	public InvoicingController(InvoicingService invoiceService){
		this.invoiceService = invoiceService;
	}
	
	@RequestMapping(method= RequestMethod.GET)
	public String setupForm(Model model){
		Invoice invoice = new Invoice();
		model.addAttribute("invoice",invoice);
		return "createInvoice";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("invoice") Invoice invoice, BindingResult result, SessionStatus status){
		
		boolean success = false; 
		
		System.out.println("Customer Selected: " + invoice.getCustomerSelection().getCustomerName());
		System.out.println("Item Selected: " + invoice.getItemSelection().getItemName());
		
		ArrayList<Item> itemList = invoice.getItemList();
		if (null != itemList && !itemList.isEmpty()) {
			for (Item item : itemList) {
				System.out.println("Item Number : " + item.getItemNumber());
				System.out.println("Item Name : " + item.getItemName());
				System.out.println("Item Description : " + item.getItemDescription());
				System.out.println("Item Unit : " + item.getItemUnit());
				System.out.println("Item Amount : " + item.getAmount());
				System.out.println("Item Price : " + item.getNetPrice());
				System.out.println("Item VAT : " + item.getVat());
				System.out.println("Item Sum : " + item.getSum());
			}
		}
		
		success = sendInvoice(invoice);
		
		String redirect = (success) ? "redirect:invoiceSentSuccess": "redirect:createInvoice";
		
		return redirect;
	}

	@ModelAttribute("customerSelection")
	public List<CustomerSelection> populateAvailableCustomers(){
		
		return invoiceService.getAvailableCustomers();
	}
	
	@ModelAttribute("itemSelection")
	public List<ItemSelection> populateAvailableItems(){
		
		return invoiceService.getAvailableItems();
	}
	
	/**
	 * @param customerName
	 */
	private boolean sendInvoice(Invoice invoice) {
		return invoiceService.sendInvoice(invoice );
	}
}
