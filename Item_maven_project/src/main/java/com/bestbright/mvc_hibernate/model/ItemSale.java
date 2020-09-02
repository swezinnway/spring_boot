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
@Table(name="ItemSale")
public class ItemSale implements Serializable {
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

 
 
 @ManyToOne(cascade = {CascadeType.MERGE,CascadeType.PERSIST})
	@JoinColumn(name="Item_Stock_id")
	private ItemStock itemstock ;


 public ItemSale() {}
 
 



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





public ItemSale(Integer id, double amount, Integer qty, Date date,  ItemStock itemstock) {
	super();
	this.id = id;
	this.amount = amount;
	this.qty = qty;
	this.date = date;
	
	this.itemstock = itemstock;
}






}
