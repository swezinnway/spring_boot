package com.bestbright.mvc_hibernate.model;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;




@Entity
@Table(name="ItemStock")
public class ItemStock implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date date;
	private Integer qty;
	private double price;
	
	@ManyToOne
	@JoinColumn(name="Item_category_id")
	private ItemCategory itemCategory ;
	
	
	@OneToMany(mappedBy = "itemstock")
	private Set<ItemSale> itemsale;
	
	@OneToMany(mappedBy = "itemstock")
	private Set<Purchase> purchases;
	
	
	public ItemStock() {}


	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	

	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public ItemCategory getItemCategory() {
		return itemCategory;
	}


	public void setItemCategory(ItemCategory itemCategory) {
		this.itemCategory = itemCategory;
	}


	public Set<ItemSale> getItemsale() {
		return itemsale;
	}


	public void setItemsale(Set<ItemSale> itemsale) {
		this.itemsale = itemsale;
	}


	public Set<Purchase> getPurchases() {
		return purchases;
	}


	public void setPurchases(Set<Purchase> purchases) {
		this.purchases = purchases;
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




	public ItemStock(Integer id, String name, Date date, Integer qty, double price, ItemCategory itemCategory,
			Set<ItemSale> itemsale, Set<Purchase> purchases) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qty = qty;
		this.price = price;
		this.itemCategory = itemCategory;
		this.itemsale = itemsale;
		this.purchases = purchases;
	}
	
	

	

	

	
	
	
	
}
