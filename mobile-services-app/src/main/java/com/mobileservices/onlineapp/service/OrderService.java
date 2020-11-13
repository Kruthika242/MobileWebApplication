package com.mobileservices.onlineapp.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobileservices.onlineapp.entity.ItemEntity;
import com.mobileservices.onlineapp.entity.OrderEntity;
import com.mobileservices.onlineapp.repository.OrderRepository;

@Service
@Transactional
public class OrderService {

	@Autowired
	OrderRepository orderRepo;
	
	@Autowired
	ItemService itemService;

	public OrderService(OrderRepository orderRepository) {
		this.orderRepo = orderRepository;
	}
	/*
	 * public void saveOrder(OrderEntity order ) { orderRepo.save(order); }
	 * 
	 * public OrderEntity ValidateUser(OrderEntity order) {
	 * 
	 * OrderEntity o=orderRepo.findById(order.getEmail()).get(); return o; }
	 */

	/*public List<OrderEntity> getAllOrders() {
		return (List<OrderEntity>) orderRepo.findAll();
	}*/
	
	public List<OrderEntity> getAllOrders(){
		List<OrderEntity> orders=new ArrayList<OrderEntity>();
		orderRepo.findAll().forEach(order1 -> orders.add(order1));
		return orders;
	}

}
