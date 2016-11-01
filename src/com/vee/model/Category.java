package com.vee.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tbl_category")
public class Category {

    private String categoryCode;
    private String categoryName;
    private List<Item> itemList;
    
    public Category() {
    }
    public Category(String categoryCode, String categoryName) {
        this.categoryCode = categoryCode;
        this.categoryName = categoryName;
    }
    @Id
    @Column(name="category_code")
    public String getCategoryCode() {
        return categoryCode;
    }
    public void setCategoryCode(String categoryCode) {
        this.categoryCode = categoryCode;
    }
    @Column(name="category_name")
    public String getCategoryName() {
        return categoryName;
    }
    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    @OneToMany(fetch=FetchType.LAZY, mappedBy="category")
    public List<Item> getItemList() {
        return itemList;
    }
    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }
    
}
