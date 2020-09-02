package com.bestbright.mvc_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bestbright.mvc_hibernate.model.Purchase;
import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class PurchaseController {

	@Autowired
	private ItemService itemService;
	
	@RequestMapping(value="/new_Purchase.htm")
	public String createPurchase(Model model) {
		model.addAttribute("purchase", new Purchase());
		model.addAttribute("purchaselist", itemService.getItemStockList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "new_purchase";
	}
	

	@RequestMapping(value="/new_Purchase.htm",method = RequestMethod.POST)
	public String savepurchase(@ModelAttribute(value="purchase") Purchase purchase) throws Exception {
		itemService.savepurchase(purchase);
		return "redirect:/purchase_list.htm";
	}
	
	@RequestMapping(value="/purchase_list.htm")
	public String showPurchase(Model model) {
		model.addAttribute("purchaselist",itemService.getpurchaseList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "purchase_list";
	}
	
	
}
