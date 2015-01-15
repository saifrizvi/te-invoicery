/**
 * Name			 : ItemSelection.java
 * Description	 : This value object will be used to retrieve the existing item for the user available for selection on create invoice page.
 * Creation Date : Dec 29, 2014
 * Version		 : 0.1 - Initial Draft Version
 * @author Saif Rizvi
 */
package com.invoicery.service.vo;

public class ItemSelection {

	private long itemId;
	private String itemName;
	
	public ItemSelection(long itemSelectionId, String itemSelectionName){
		this.itemId = itemSelectionId;
		this.itemName = itemSelectionName;
	}

	public long getItemId() {
		return itemId;
	}

	public void setItemId(long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

}
