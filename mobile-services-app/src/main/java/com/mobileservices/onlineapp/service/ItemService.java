package com.mobileservices.onlineapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileservices.onlineapp.entity.ItemEntity;
import com.mobileservices.onlineapp.repository.ItemRepository;

@Service
public class ItemService {
	
	@Autowired
	ItemRepository itemRepo;
	
	public List<ItemEntity> getItems(){
		List<ItemEntity> items=new ArrayList<ItemEntity>();
		itemRepo.findAll().forEach(item1 -> items.add(item1));
		return items;
	}
	
	/*public List<ItemEntity> getItems() {
		return (List<ItemEntity>) orderRepo.findAll();
	}*/
	
	
	public ItemEntity getItemByModel(int model) {
		return itemRepo.findById(model).get();	
	}
	
	public void updateItem(ItemEntity items) {
		itemRepo.save(items);
	}
	
	public void deleteItem(int model) {
		itemRepo.deleteById(model);
	}

}
