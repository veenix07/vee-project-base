package com.vee.dao.impl;

import java.util.List;

import com.vee.dao.BaseDAO;
import com.vee.dao.ItemDAO;
import com.vee.model.Item;

public class ItemDAOImpl extends BaseDAO<Item,String> implements ItemDAO {

	public ItemDAOImpl() {
		super(Item.class);
	}

    @Override
    public List<Item> search(String ID) {
        return (List<Item>) getHibernateTemplate().find("from Item item where item.itemCode = ?", ID);
    }
	
}
