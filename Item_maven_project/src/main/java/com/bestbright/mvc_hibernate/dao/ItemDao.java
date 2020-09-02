package com.bestbright.mvc_hibernate.dao;

import java.util.List;



import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.SharedSessionContract;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.transform.Transformers;
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
	
	
//	public List<ItemStock> searchItem(String name){
//		Criteria cr=getSesssion().createCriteria(ItemStock.class);
//		cr.add(Restrictions.ilike("name","name%"));
//		return (List<ItemStock>)cr.list();
//	}
//	
	
//	@SuppressWarnings("unchecked")
//	public List<ItemStock> findsearchitem(String itemname){
//		return getCurrentSession().createSQLQuery("SELECT a.* FROM ItemStock a WHERE a.name LIKE : name")
//				.setParameter("name",itemname+"%")
//				.setResultTransformer(Transformers.aliasToBean(ItemStock.class))
//				.list();
//		
//	}

	public List<ItemStock> findsearchitem(String itemname){
		Criteria cr=getSesssion().createCriteria(ItemStock.class);
		Criterion name =Restrictions.ilike("name","itemname%");
		cr.add(name);
		return (List<ItemStock>)cr.list();
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
		String hql = "DELETE FROM ItemCategory WHERE id = :id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return query.executeUpdate();  
		 
	}   
	public int deleteStock(Integer id){    
		String hql = "DELETE FROM ItemStock WHERE id = :id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return query.executeUpdate();  
		 
	}   
	
	public ItemCategory findById(Integer id) {
		String hql = "SELECT itemCategory FROM ItemCategory itemCategory WHERE id=:id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return (ItemCategory) query.uniqueResult();
	}

	
	@SuppressWarnings("unchecked")
	public List<ItemStock> getItemBySearch(String search) {
		if(search=="") {
			Criteria cr = getSesssion().createCriteria(ItemStock.class);
			return (List<ItemStock>) cr.list();
		}else{
		Criteria cr = getSesssion().createCriteria(ItemStock.class);
		cr.add(Restrictions.like("name", search+"%"));
		return (List<ItemStock>) cr.list();
		}
	}
	

	public List<ItemStock> getItemListByCategory(int name) {
		if(name!=0) {
			String sql = "FROM ItemStock WHERE Item_category_id=:id";
			Query query = getSesssion().createQuery(sql);
			query.setParameter("id", name);
			return (List<ItemStock>) query.list();
		}else {
			Criteria cr = getSesssion().createCriteria(ItemStock.class);
			return (List<ItemStock>) cr.list();
		}
	}

	public int deleteSale(Integer id) {
		String hql = "DELETE FROM ItemSale WHERE id = :id";
		Query query=getSesssion().createQuery(hql);
		query.setParameter("id", id);
		return query.executeUpdate();  
		
	}
}
