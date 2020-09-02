package com.bestbright.mvc_hibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bestbright.dto.ItemStockDTO;

import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class ItemStockController {
	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping(value="/new_Itemstock.htm")
	public String createItemStock(Model model) {
		model.addAttribute("items", new ItemStockDTO());
		model.addAttribute("itemstockList", itemService.getCategoryList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "new_Itemstock";
	}

	@RequestMapping(value="/new_Itemstock.htm",method = RequestMethod.POST)
	public String saveItemStock(@ModelAttribute(value="items") ItemStockDTO itemstock,BindingResult result) throws Exception {
		try{
			if(result.hasErrors()) {
				return "new_Itemstock";
			}else {
				itemService.saveItemstock(itemstock);
				
				return "redirect:/itemstock_list.htm";
			}
			
		}catch(Exception e){
			return "new_Itemstock";
		}
		//return "new_student";
	}
	
	
	@RequestMapping(value="/ItemShow.htm")
	public String showItemStock(Model model) {
		model.addAttribute("itemstockList",itemService.getItemStockList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "ItemShow";
	}
	
	@RequestMapping(value="/itemstock_list.htm")
	public String showItemStock1(Model model) {
		model.addAttribute("itemstockList",itemService.getItemStockList());
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "itemstock_list";
	}

		

}
