package com.bestbright.mvc_hibernate.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.bestbright.mvc_hibernate.model.ItemCategory;
import com.bestbright.mvc_hibernate.model.ItemSale;
import com.bestbright.mvc_hibernate.model.ItemStock;
import com.bestbright.mvc_hibernate.model.Purchase;




@Repository
public class ItemDao {

	@Autowired
	SessionFactory sessionFactory;
	
	public Session getSesssion(){
		return sessionFactory.getCurrentSession();
	}
	
	public void saveCategory(ItemCategory itemcategory){
		getSesssion().save(itemcategory);
	}
	
	
	public List<ItemCategory> getCategoryList(){
		Criteria cr=getSesssion().createCriteria(ItemCategory.class);
		return (List<ItemCategory>)cr.list();
	}
	
	public void saveItemstock(ItemStock itemstock){
		getSesssion().save(itemstock);
	}
	
	
	public List<ItemStock> getItemstockList(){
		Criteria cr=getSesssion().createCriteria(ItemStock.class);
		return (List<ItemStock>)cr.list();
	}
	
	public void saveItemsale(ItemSale itemsale){
		getSesssion().save(itemsale);
	}
	
	
	public List<ItemSale> getItemsaleList(){
		Criteria cr=getSesssion().createCriteria(ItemSale.class);
		return (List<ItemSale>)cr.list();
	}
	
	
	public void savepurchase(Purchase purchase){
		getSesssion().save(purchase);
	}
	
	
	public List<Purchase> getpurchaseList(){
		Criteria cr=getSesssion().createCriteria(Purchase.class);
		return (List<Purchase>)cr.list();
	}
	

	public boolean UpdateItem(Integer id, Integer qty) {
		String hq="Update ItemStock set qty=qty-:qty where id=:id";
		Query query=getSesssion().createQuery(hq);
		query.setParameter("qty", qty);
		query.setParameter("id", id);
		query.executeUpdate();
		return true;
	

}
	public boolean UpdateItempurchase(Integer id, Integer qty) {
		String hq="Update ItemStock set qty=qty+:qty where id=:id";
		Query query=getSesssion().createQuery(hq);
		query.setParameter("qty", qty);
		query.setParameter("id", id);
		query.executeUpdate();
		return true;
	

}
	
	
	
	public int delete(Integer id){    
		String hql = "DELETE FROM Category WHERE id = :id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return query.executeUpdate();   
		 
	}    
}
