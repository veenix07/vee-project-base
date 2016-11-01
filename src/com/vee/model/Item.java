package com.vee.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tbl_item")
public class Item {
	private String itemCode;
	private String itemName;
	private String itemDesc;
	private Integer qty;
	private Category category;
	
	public Item() {
	}
	
	public Item(String itemCode, String itemName, String itemDesc, Integer qty) {
		super();
		this.itemCode = itemCode;
		this.itemName = itemName;
		this.itemDesc = itemDesc;
		this.qty = qty;
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
	@Column(name="item_desc")
    public String getItemDesc() {
        return itemDesc;
    }
    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }
    @Column(name="qty")
    public Integer getQty() {
        return qty;
    }
    public void setQty(Integer qty) {
        this.qty = qty;
    }
    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="category_code", nullable=false)
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}
