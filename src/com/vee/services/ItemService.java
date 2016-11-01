package com.vee.services;

import java.util.List;

import com.vee.model.Item;

public interface ItemService extends IService<Item, String> {
	public List<Item> findItemByCategories();
}
