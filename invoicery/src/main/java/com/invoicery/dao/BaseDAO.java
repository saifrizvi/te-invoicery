/**
 * Name			 : BaseDAO.java
 * Description	 : 
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.dao;

import static com.invoicery.common.CommonConstants.DATA_STORE_PATH;
import static com.invoicery.common.CommonConstants.SPREADSHEET_CUSTOMER;
import static com.invoicery.common.CommonConstants.SPREADSHEET_INVOICE;
import static com.invoicery.common.CommonConstants.SPREADSHEET_ITEM;

import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class BaseDAO {

	private File invoiceDataSource;
	private Workbook dbWorkbook; //Workbook.getWorkbook(new File(excelWbName)); 
	private Sheet invoiceTblSheet; //dbWorkbook.getSheet(excelSpreadsheet);
	private Sheet customerTblSheet;
	private Sheet itemTblSheet;
	
	public BaseDAO() {
		invoiceDataSource = new File(DATA_STORE_PATH);
		try {
			dbWorkbook = Workbook.getWorkbook(invoiceDataSource);
		} catch (BiffException | IOException e) {
			// TODO implement logging framework
			e.printStackTrace();
		}
		invoiceTblSheet = dbWorkbook.getSheet(SPREADSHEET_INVOICE);
		customerTblSheet = dbWorkbook.getSheet(SPREADSHEET_CUSTOMER);
		itemTblSheet = dbWorkbook.getSheet(SPREADSHEET_ITEM);
		
		}
	
	public static void main(String args[]) throws BiffException, IOException, URISyntaxException{
//		BaseDAO baseDAO = new BaseDAO();
//		System.out.println(baseDAO.getInvoiceDataSource().getName());
//		System.out.println(baseDAO.getDbWorkbook().getVersion());
//		System.out.println(baseDAO.getInvoiceTblSheet().getRows());
//		System.out.println(baseDAO.getCustomerTblSheet().getColumns());
//		System.out.println(baseDAO.getItemTblSheet().getSettings());
	}
	
	public File getInvoiceDataSource() {
		return invoiceDataSource;
	}

	public void setInvoiceDataSource(File invoiceDataSource) {
		this.invoiceDataSource = invoiceDataSource;
	}

	public Workbook getDbWorkbook() {
		return dbWorkbook;
	}

	public void setDbWorkbook(Workbook dbWorkbook) {
		this.dbWorkbook = dbWorkbook;
	}

	public Sheet getInvoiceTblSheet() {
		return invoiceTblSheet;
	}

	public void setInvoiceTblSheet(Sheet invoiceTblSheet) {
		this.invoiceTblSheet = invoiceTblSheet;
	}

	public Sheet getCustomerTblSheet() {
		return customerTblSheet;
	}

	public void setCustomerTblSheet(Sheet customerTblSheet) {
		this.customerTblSheet = customerTblSheet;
	}

	public Sheet getItemTblSheet() {
		return itemTblSheet;
	}

	public void setItemTblSheet(Sheet itemTblSheet) {
		this.itemTblSheet = itemTblSheet;
	}
}
