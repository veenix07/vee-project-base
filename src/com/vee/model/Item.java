package com.vee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")
public class Item {
	private String itemCode;
	private String itemName;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(String itemCode, String itemName) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
	}

	@Id
	@Column(name="item_code")
	public String getItemCode() {
		return itemCode;
	}
	public void setItemCode(String itemCode) {
		this.itemCode = itemCode;
	}
	@Column(name="item_name")
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
}
