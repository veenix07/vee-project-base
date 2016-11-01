package com.vee.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.vee.dao.impl.ItemDAOImpl;
import com.vee.model.Item;
import com.vee.services.BaseService;
import com.vee.services.ItemService;

public class ItemServiceImpl extends BaseService<Item,String> implements ItemService {

	@Override
	public List<Item> findItemByCategories() {
		// TODO Auto-generated method stub
		return null;
	}
}
