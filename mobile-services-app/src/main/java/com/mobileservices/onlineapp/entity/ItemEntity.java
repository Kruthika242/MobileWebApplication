package com.mobileservices.onlineapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="item")
public class ItemEntity {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="model")
	private int model;
	
	@Column(name="itemname", nullable=false)
	private String itemname;
	
	@Column(name="color", nullable=false)
	private String color;
	
	@Column(name="price", nullable=false)
	private float price;
	
	@Column(name="image", nullable=false)
	private byte[] image;
	
	@Column(name="features", nullable=false)
	private String features;
	
	@Column(name="productid", nullable=false)
	private int productid;
	
	@Column(name="categoryid", nullable=false)
	private int categoryid;
	
	@Column(name="quantityavailable", nullable=false)
	private int quantityavailable;
	
	public ItemEntity() {
		super();
	}
	
	public ItemEntity(int model, String itemname, String color, float price,byte[] image,
			String features, int productid,int categoryid, int quantityavailable){
		super();
		this.model=model;
		this.itemname=itemname;
		this.color=color;
		this.price=price;
		this.image=image;
		this.features=features;
		this.productid=productid;
		this.categoryid=categoryid;
		this.quantityavailable=quantityavailable;
		
	}
	
	public int getModel() {
		return model;
	}
	public void setModel(int model) {
		this.model = model;
	}
	public String getItemname() {
		return itemname;
	}
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public String getFeatures() {
		return features;
	}
	public void setFeatures(String features) {
		this.features = features;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getQuantityavailable() {
		return quantityavailable;
	}
	public void setQuantityavailable(int quantityavailable) {
		this.quantityavailable = quantityavailable;
	}
	

}
