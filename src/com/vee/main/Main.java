package com.vee.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vee.model.Category;
import com.vee.model.Item;
import com.vee.services.CategoryService;
import com.vee.services.ItemService;

public class Main {
	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/spring/application-context.xml");
//		Item item = applicationContext.getBean(Item.class);
//		System.out.printf("%s %s", item.getItemCode(), item.getItemName());
		ItemService itemService = (ItemService) applicationContext.getBean("itemServiceImpl");
		CategoryService categoryService = (CategoryService) applicationContext.getBean("categoryServiceImpl");
//		Item item = itemService.read("B023");
//		System.out.println(item.getItemName());
//		Category cat = new Category("C001", "Category 01");

		Category cat = categoryService.read("C001");
	    for(Item item : cat.getItemList()){
	        System.out.println(item.getItemCode());
	    }
//		categoryService.create(cat);
//		Item item = new Item();
//		item.setItemCode("B025");
//		item.setItemName("Banana023212");
//		item.setItemDesc("Banana split 001");
//		item.setQty(100);
//		item.setCategory(cat);
//		itemService.create(item);
//		List<Item> itemList = itemService.search("B023");
//		for(Item item : itemList){
//		    System.out.println(item.getItemCode());
//		}
//		itemService.delete(item);
	}
}
