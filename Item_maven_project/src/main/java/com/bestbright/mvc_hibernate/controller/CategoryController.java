package com.bestbright.mvc_hibernate.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


import com.bestbright.mvc_hibernate.model.ItemCategory;

import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class CategoryController {
	@Autowired
	private ItemService itemService;

	
	
	@RequestMapping(value="/new_Category.htm")
	public String createCategory(Model model) {
		model.addAttribute("categorys", new ItemCategory());
		model.addAttribute("categoryList", itemService.getCategoryList());
		return "new_Category";
	}

	@RequestMapping(value="/new_Category.htm",method = RequestMethod.POST)
	public String saveCategory(@ModelAttribute(value="categorys") ItemCategory itemcategory) throws Exception {
		itemService.saveCategory(itemcategory);
		return "redirect:/Category_list.htm";
	}
	
	@RequestMapping(value="/Category_list.htm")
	public String showCategory(Model model) {
		model.addAttribute("categoryList",itemService.getCategoryList());
		return "Category_list";
	}
	
	

	@RequestMapping(value="/delete/{id}")
	public String deleteCategoryForm(@PathVariable Integer id) {
		itemService.delete(id);
	    return "Category_list";       
	} 
	
	@RequestMapping(value="/edit/{id}",method=RequestMethod.GET)
	
	public String editCategoryForm(@PathVariable Integer id,Model model) {
		ItemCategory ic = itemService.findById(id);
		model.addAttribute("categorys", ic);
		System.out.println("---------is -----"+ ic.getName());
	    return "edit_category";       
	}
	@RequestMapping(value="/edit/{id}",method=RequestMethod.POST)
	public String updateCategory(@ModelAttribute ItemCategory categorys) {
		itemService.updateSave(categorys);
		return"redirect:/Category_list.htm";
	}
	
}
