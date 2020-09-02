package com.bestbright.mvc_hibernate.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="Purchase")
public class Purchase implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
 private Integer id;
 private double amount;
 private Integer qty;
 @DateTimeFormat(pattern="yyyy-MM-dd") 
 private Date date;
 private double totalamount;
 
 
 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="Item_Stock_id")
	private ItemStock itemstock ;


 public Purchase() {}
 
 



public double getAmount() {
	return amount;
}


public void setAmount(double amount) {
	this.amount = amount;
}




public Date getDate() {
	return date;
}


public void setDate(Date date) {
	this.date = date;
}


public double getTotalamount() {
	return totalamount;
}


public void setTotalamount(double totalamount) {
	this.totalamount = totalamount;
}


public ItemStock getItemstock() {
	return itemstock;
}


public void setItemstock(ItemStock itemstock) {
	this.itemstock = itemstock;
}





public Integer getId() {
	return id;
}





public void setId(Integer id) {
	this.id = id;
}





public Integer getQty() {
	return qty;
}





public void setQty(Integer qty) {
	this.qty = qty;
}





public Purchase(Integer id, double amount, Integer qty, Date date, double totalamount, ItemStock itemstock) {
	super();
	this.id = id;
	this.amount = amount;
	this.qty = qty;
	this.date = date;
	this.totalamount = totalamount;
	this.itemstock = itemstock;
}
}
