package com.best.bright.onile_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


import com.best.bright.onile_course.model.Level;
import com.best.bright.onile_course.repository.CourseRepository;
import com.best.bright.onile_course.repository.LevelRepository;

@Controller
public class LevelController {

	@Autowired
	private LevelRepository levelRepository;
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/create_level")
	public String createLevel(Model model) {
		model.addAttribute("level", new Level());
		model.addAttribute("courseList",courseRepository.findAll());
		return "add_level";
	}
	@PostMapping("/save_level")
	public String saveLevel(@ModelAttribute("level")Level level,Model model) {
		
		levelRepository.save(level);
		
		model.addAttribute("levelList",levelRepository.findAll());
		return "level_list";
	}
	
	
}
