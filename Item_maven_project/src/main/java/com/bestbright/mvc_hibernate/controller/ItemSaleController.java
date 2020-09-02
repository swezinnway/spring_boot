package com.bestbright.mvc_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.bestbright.mvc_hibernate.model.ItemSale;
import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class ItemSaleController {
	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/new_ItemSale.htm")
	public String createItemSale(Model model) {
		model.addAttribute("itemsale", new ItemSale());
		model.addAttribute("itemsaleList", itemService.getItemStockList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "new_Itemsale";
	}
	
	@RequestMapping(value="/new_ItemSale.htm",method = RequestMethod.POST)
	public String saveItemsale(@ModelAttribute(value="itemsale") ItemSale itemsale) throws Exception {
		itemService.saveItemsale(itemsale);
		return "redirect:/Itemsale_list.htm";
	}
	
	@RequestMapping(value="/Itemsale_list.htm")
	public String showItemSale(Model model) {
		model.addAttribute("itemsaleList",itemService.getItemsaleList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "Itemsale_list";
	}
	
	

}
