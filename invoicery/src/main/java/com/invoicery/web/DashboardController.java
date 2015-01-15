/**
 * Name			 : DashboardController.java
 * Description	 : 
 * Creation Date : Dec 24, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.web;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.invoicery.service.vo.Customer;

@Controller
public class DashboardController {

	@RequestMapping(value = "/dashboard", method = RequestMethod.GET)
	public String dashboard(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "dashboard";
	}
	
	@RequestMapping(value = "/invoices", method = RequestMethod.GET)
	public String invoices(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "invoices";
	}
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET)
	public String customers(Model model){
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return "customers";
	}
	
	@RequestMapping(value = "/invoiceSentSuccess", method= RequestMethod.GET)
	public String invoiceSentSuccess(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "invoiceSentSuccess";
	}
	
	@RequestMapping(value = "/items", method = RequestMethod.GET)
	public String items(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "items";
	}
	
	@RequestMapping(value = "/reports", method = RequestMethod.GET)
	public String reports(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "reports";
	}
	
	@RequestMapping(value = "/bookkeeping", method = RequestMethod.GET)
	public String bookkeeping(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "bookkeeping";
	}
	
	@RequestMapping(value = "/addons", method = RequestMethod.GET)
	public String addons(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "addons";
	}
	
	@RequestMapping(value = "/tags/header/logo-upload", method = RequestMethod.GET)
	public String logoUpload(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/header/logo-upload";
	}
	
	@RequestMapping(value = "/tags/header/user-account", method = RequestMethod.GET)
	public String userAccount(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/header/user-account";
	}
	
	@RequestMapping(value = "/tags/footer/about-us", method = RequestMethod.GET)
	public String aboutUs(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/footer/about-us";
	}
	
	@RequestMapping(value = "/tags/footer/contact", method = RequestMethod.GET)
	public String contact(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/footer/contact";
	}
	
	@RequestMapping(value = "/tags/footer/help", method = RequestMethod.GET)
	public String help(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/footer/help";
	}
	
	@RequestMapping(value = "/tags/footer/privacy-policy", method = RequestMethod.GET)
	public String privacyPolicy(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/footer/privacy-policy";
	}
	
	@RequestMapping(value = "/tags/footer/terms-conditions", method = RequestMethod.GET)
	public String termsAndConditions(Model model){
		Date today = new Date();
		model.addAttribute("today", today);
		return "/tags/footer/terms-conditions";
	}
}
