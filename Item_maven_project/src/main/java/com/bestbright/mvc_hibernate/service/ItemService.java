package com.bestbright.mvc_hibernate.service;


import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bestbright.dto.ItemStockDTO;

import com.bestbright.mvc_hibernate.dao.ItemDao;

import com.bestbright.mvc_hibernate.model.ItemCategory;
import com.bestbright.mvc_hibernate.model.ItemSale;
import com.bestbright.mvc_hibernate.model.ItemStock;
import com.bestbright.mvc_hibernate.model.Purchase;

@Service
@Transactional
public class ItemService {
	@Autowired
	ServletContext serveletContext;
	@Autowired
	ItemDao itemDao;
	
	public String UPLOAD_DIRECTORY="/images/";
	
	
	public void saveCategory(ItemCategory itemcategory) throws Exception{
		try{
			itemDao.saveCategory(itemcategory);
		}catch(Exception ex){
			throw ex;
		}
	}

	
	
	public List<ItemCategory> getCategoryList(){
		return itemDao.getCategoryList();
	}
	
	public void saveItemstock(ItemStockDTO itemstockdto) throws Exception{
		if(itemstockdto!=null){
	    	String path = serveletContext.getRealPath(UPLOAD_DIRECTORY);   
	        String filename=itemstockdto.getFile().getOriginalFilename() ; 
	          
	        System.out.println(path+" "+filename);  
	        try{  
	            byte[] bytes = itemstockdto.getFile().getBytes();  
	            BufferedOutputStream stream =new BufferedOutputStream(new FileOutputStream(  
	                 new File(path +"/"+ filename)));  
	            stream.write(bytes);  
	            stream.flush();  
	            stream.close();  
	          
	        }catch(Exception e){System.out.println(e);}
	        ItemStock itstock=new ItemStock(itemstockdto.getName(),itemstockdto.getDate(),itemstockdto.getQty(),itemstockdto.getPrice(),filename,itemstockdto.getItemcategory());
	        itemDao.saveItemstock(itstock);
	    }
	}
	//itemDao.saveItemstock(itemstock);
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

	
	
	public  List<ItemStock> getSearchitem(String itemname){
		return itemDao.findsearchitem(itemname);
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

	public void delete(Integer id) {
		itemDao.delete(id);
    }
	
	public ItemCategory findById(Integer id) {
		return itemDao.findById(id);
	}
	
	public void updateSave(ItemCategory itemCategory) {
		ItemCategory ic = this.findById(itemCategory.getId());
		ic.setCodeno(itemCategory.getCodeno());
		ic.setName(itemCategory.getName());
		try {
			this.saveCategory(ic);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	
	public List<ItemStock> listAll(String keyword) {
		if (keyword != null) {
	        return itemDao.getItemBySearch(keyword);
	    }
		return itemDao.getItemstockList();
	}
	
	public List<ItemStock> getItemListByCategory(int cname) {
		return itemDao.getItemListByCategory(cname);
	}

}
