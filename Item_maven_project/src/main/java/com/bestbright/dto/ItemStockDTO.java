package com.bestbright.dto;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import com.bestbright.mvc_hibernate.model.ItemCategory;

public class ItemStockDTO {

	private Integer id;
	@NotEmpty(message = "Please fill your name")
	private String name;
	@DateTimeFormat(pattern="yyyy-MM-dd") 
	private Date date;
	private Integer qty;
	private double price;
	private String photoPath;
	private MultipartFile file;
	private ItemCategory itemcategory=new ItemCategory();
	
	
	
	public ItemStockDTO(Integer id, String name, Date date, Integer qty, double price, String photoPath,
			MultipartFile file, ItemCategory itemcategory) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.qty = qty;
		this.price = price;
		this.photoPath = photoPath;
		this.file = file;
		this.itemcategory = itemcategory;
	}
	
	public ItemStockDTO() {
		super();
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
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
	public Integer getQty() {
		return qty;
	}
	public void setQty(Integer qty) {
		this.qty = qty;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getPhotoPath() {
		return photoPath;
	}
	public void setPhotoPath(String photoPath) {
		this.photoPath = photoPath;
	}
	public MultipartFile getFile() {
		return file;
	}
	public void setFile(MultipartFile file) {
		this.file = file;
	}
	public ItemCategory getItemcategory() {
		return itemcategory;
	}
	public void setItemcategory(ItemCategory itemcategory) {
		this.itemcategory = itemcategory;
	}
	
	
}
