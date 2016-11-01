package com.vee.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vee.model.Item;
import com.vee.services.ItemService;

public class Main {
	public static void main(String[] args){
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("resource/spring/application-context.xml");
//		Item item = applicationContext.getBean(Item.class);
//		System.out.printf("%s %s", item.getItemCode(), item.getItemName());
		ItemService itemService = (ItemService) applicationContext.getBean("itemServiceImpl");
		
		Item item = itemService.read("B023");
		System.out.println(item.getItemName());
//		item.setItemCode("B023");
//		item.setItemName("Banana023212");
//		itemService.create(item);
	}
}
