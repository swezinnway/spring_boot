package com.best.bright.onile_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.best.bright.onile_course.model.Level;
import com.best.bright.onile_course.model.Level_vedio;
import com.best.bright.onile_course.repository.LevelRepository;
import com.best.bright.onile_course.repository.Level_vedioRepository;

@Controller
public class vedioController {

	@Autowired
	private Level_vedioRepository level_vedioRepository;
	@Autowired
	private LevelRepository levelRepository;
	
	@GetMapping("/create_vedio")
	public String createvedio(Model model) {
		model.addAttribute("vedio", new Level_vedio());
		model.addAttribute("levelList",levelRepository.findAll());
		return "add_vedio";
	}
	
	
	@PostMapping("/save_vedio")
	public String savevedio(@ModelAttribute("vedio")Level_vedio level_vedio,Model model) {
		
		level_vedioRepository.save(level_vedio);
		
		model.addAttribute("vediolist",level_vedioRepository.findAll());
		return "level_list";
	}
	
	
}
