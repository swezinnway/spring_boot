package com.bestbright.mvc_hibernate.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bestbright.mvc_hibernate.service.ItemService;

@Controller
public class userviewController {

	@Autowired
	private ItemService itemService;
	
	
	@RequestMapping("/user_show_view.htm")
    public String viewHomePage(Model model) {
        model.addAttribute("itemstockList", itemService.getItemStockList());
        model.addAttribute("categoryList",itemService.getCategoryList());
        return "user_show_view";
    }
    @RequestMapping("/user_show")
    public String viewSearchPage(Model model,@RequestParam("search") String keyword) {
        model.addAttribute("itemstockList", itemService.listAll(keyword));
        model.addAttribute("categoryList",itemService.getCategoryList());
        System.out.println("Result keyword:"+keyword);
        return "user_show_view";
    }
    @RequestMapping(value="/selectCategory")
    public String viewSearchByCategory(Model model,@RequestParam("category")int id) {
        model.addAttribute("itemstockList", itemService.getItemListByCategory(id));
        model.addAttribute("categoryList",itemService.getCategoryList());
        System.out.println("Result keyword:"+id);
        return "user_category_view";
    }
}
