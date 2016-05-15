package com.TOMSystem.Item;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.TOMSystem.Order.*;
@Entity
public class Item implements java.io.Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private int id;
	@Column
	private String category;
	@Column
	private String name;
	@Column
	private String picture;
	@Column
	private double calories;
	@Column
	private double unit_price;
	@Column
	private int prep_time;

	@Column
	private boolean availability;

	//@ManyToOne
	//@JoinColumn(name="order_id")
	//private Order order1;

	
	public Item(){}
	
	public Item(int id, String category, String name, String picture, double calories, double unit_price,
			int prep_time,boolean availability) {
		super();
		this.id = id;
		this.category = category;
		this.name = name;
		this.picture = picture;
		this.calories = calories;
		this.unit_price = unit_price;
		this.prep_time = prep_time;

		this.availability = availability;

		//this.order1=order;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public double getCalories() {
		return calories;
	}

	public void setCalories(double calories) {
		this.calories = calories;
	}

	public double getUnit_price() {
		return unit_price;
	}

	public void setUnit_price(double unit_price) {
		this.unit_price = unit_price;
	}

	public int getPrep_time() {
		return prep_time;
	}

	public void setPrep_time(int prep_time) {
		this.prep_time = prep_time;
	}	
	

	public boolean getavailability() {
		return availability ;
	}

	public void setavailability(boolean availability) {
		this.availability = availability;
	}	
	

//	public Order getOrder() {
//		return order1;
//	}
//
//	public void setOrder(Order order1) {
//		this.order1 = order1;
//	}	

}
