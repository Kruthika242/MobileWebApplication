package com.mobileservices.onlineapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="orders")
public class OrderEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="orderid")
	private int orderid;
	
	@Column(name="fullname", nullable=false)
	private String fullname;
	
	@Column(name="email", nullable=false)
	private String email;
	
	@Column(name="address", nullable=false)
	private String address;
	
	@Column(name="model", nullable=false)
	private int model;
	
	@Column(name="quantity", nullable=false)
	private int quantity;
	
	@Column(name="total", nullable=false)
	private float total;
	
	@Column(name="date", nullable=false)
	private String date;
	
	@Column(name="modeofpayment", nullable=false)
	private String modeofpayment;

	public OrderEntity() {
		super();
	}

	public OrderEntity(int orderid,String fullname, String email, String address, int model,int quantity, float total,String date, String modeofpayment){
		super();
		this.orderid= orderid;
		this.fullname = fullname;
		this.email = email;
		this.address = address;
		this.model = model;
		this.quantity = quantity;
		this.total = total;
		this.date = date;
		this.modeofpayment = modeofpayment;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getModel() {
		return model;
	}

	public void setModel(int model) {
		this.model = model;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getModeofpayment() {
		return modeofpayment;
	}

	public void setModeofpayment(String modeofpayment) {
		this.modeofpayment = modeofpayment;
	}
}
