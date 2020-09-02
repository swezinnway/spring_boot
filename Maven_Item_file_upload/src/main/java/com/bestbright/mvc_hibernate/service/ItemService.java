package com.bestbright.mvc_hibernate.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.mvc_hibernate.dao.ItemDao;

import com.bestbright.mvc_hibernate.model.ItemCategory;
import com.bestbright.mvc_hibernate.model.ItemSale;
import com.bestbright.mvc_hibernate.model.ItemStock;
import com.bestbright.mvc_hibernate.model.Purchase;

@Service
@Transactional
public class ItemService {
	@Autowired
	ItemDao itemDao;
	
	public void saveCategory(ItemCategory itemcategory) throws Exception{
		try{
			itemDao.saveCategory(itemcategory);
		}catch(Exception ex){
			throw ex;
		}
	}
//	public void delete(ItemCategory itemcategory) throws Exception{
//		try{
//			
//			itemDao.delete(id);
//		}catch(Exception ex){
//			throw ex;
//		}
//	}
	
	public List<ItemCategory> getCategoryList(){
		return itemDao.getCategoryList();
	}
	
	public void saveItemstock(ItemStock itemstock) throws Exception{
		try{
			itemDao.saveItemstock(itemstock);
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public List<ItemStock> getItemStockList(){
	return itemDao.getItemstockList();
	}
	
	public void saveItemsale(ItemSale itemsale) throws Exception{
		try{
			itemDao.saveItemsale(itemsale);
			itemDao.UpdateItem(itemsale.getItemstock().getId(), itemsale.getQty());
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public List<ItemSale> getItemsaleList(){
	return itemDao.getItemsaleList();
	}

	public void savepurchase(Purchase purchase) throws Exception{
		try{
			itemDao.savepurchase(purchase);
			itemDao.UpdateItempurchase(purchase.getItemstock().getId(), purchase.getQty());
			
		}catch(Exception ex){
			throw ex;
		}
	}
	
	public List<Purchase> getpurchaseList(){
	return itemDao.getpurchaseList();
	}

	
}
