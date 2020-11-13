package com.mobileservices.onlineapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.validation.BindingResult;
//import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.mobileservices.onlineapp.entity.ItemEntity;
import com.mobileservices.onlineapp.entity.OrderEntity;
import com.mobileservices.onlineapp.repository.OrderRepository;
import com.mobileservices.onlineapp.service.ItemService;
import com.mobileservices.onlineapp.service.OrderService;

@Controller
public class OrderController {
	//@Autowired
	//private OrderRepository orderRepository;

	@Autowired
	OrderService orderService;
	
	@Autowired
	ItemService itemService;
	
	@RequestMapping("/adminlogin")
	public String adminLogin() {
		return "adminlogin";
	}
	/*
	 * @RequestMapping("/vieworders") public String viewOrders() { return
	 * "vieworders"; }
	 */

	// Show All Orders
	@GetMapping("/orders")
	public List<OrderEntity> getAllOrders() {
		System.out.println(this.getClass().getSimpleName() + ":=======>Showing Orders list.");
		 ModelAndView modelview = new ModelAndView("orders"); // Here vieworders is a jsp page name
		 List<OrderEntity> orderList = orderService.getAllOrders();
		 modelview.addObject("order", orderList); // Set the attribute as "orderList"
		 return orderList;
		//return orderService.getAllOrders();
	}

	/*
	 * @RequestMapping("/login") public String login() {
	 *
	 * return "login"; }
	 * 
	 * @RequestMapping("/register") public String register() {
	 * 
	 * return "register"; }
	 * 
	 * @PostMapping(path="/validateuser") public ModelAndView
	 * ValidateUser(@ModelAttribute OrderEntity order,BindingResult bindingResult) {
	 * OrderEntity o= orderRepository.save(order); ModelAndView m=new
	 * ModelAndView("successpage") ; m.addObject("l", o); return m; }
	 * 
	 * 
	 * @PostMapping(path="/saveOrder") public ModelAndView saveOrder(OrderEntity
	 * order) { OrderEntity o= orderRepository.save(order); ModelAndView m=new
	 * ModelAndView("successpage") ; m.addObject("l", o); return m;
	 * 
	 * }
	 */
	
	@GetMapping("/products")
	private List<ItemEntity> getAllItems(){
		return itemService.getItems();
		
	}
	
	@GetMapping("/product/{model}")
	private ItemEntity getItems(@PathVariable("model") int model) {
		return itemService.getItemByModel(model);
	}
	
	@PutMapping("/updateproduct")
	private ItemEntity  updateItem(@RequestBody ItemEntity items) {
		 itemService.updateItem(items);
		 return items;
	}
	
	@DeleteMapping("/product/{model}")
	private void deleteItem(@PathVariable("model") int model) {
		 itemService.deleteItem(model);
	}

}
