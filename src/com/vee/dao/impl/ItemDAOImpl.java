package com.vee.dao.impl;

import com.vee.dao.BaseDAO;
import com.vee.dao.ItemDAO;
import com.vee.model.Item;

public class ItemDAOImpl extends BaseDAO<Item,String> implements ItemDAO {

	public ItemDAOImpl() {
		super(Item.class);
	}
	
}
