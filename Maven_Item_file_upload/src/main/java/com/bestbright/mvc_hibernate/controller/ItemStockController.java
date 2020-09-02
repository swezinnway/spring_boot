package com.bestbright.mvc_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bestbright.mvc_hibernate.model.ItemStock;
import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class ItemStockController {
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping(value="/new_Itemstock.htm")
	public String createItemStock(Model model) {
		model.addAttribute("items", new ItemStock());
		model.addAttribute("itemstockList", itemService.getCategoryList());
		return "new_Itemstock";
	}

	@RequestMapping(value="/new_Itemstock.htm",method = RequestMethod.POST)
	public String saveItemStock(@ModelAttribute(value="items") ItemStock itemstock) throws Exception {
	
		itemService.saveItemstock(itemstock);
		
		return "redirect:/itemstock_list.htm";
	}
	
	@RequestMapping(value="/itemstock_list.htm")
	public String showItemStock(Model model) {
		model.addAttribute("itemstockList",itemService.getItemStockList());
		return "itemstock_list";
	}
}
