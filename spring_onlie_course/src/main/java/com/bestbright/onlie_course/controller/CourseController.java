package com.bestbright.onlie_course.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.bestbright.onlie_course.model.Course;
import com.bestbright.onlie_course.repository.CourseRepository;



@Controller
public class CourseController {
	
	@Autowired
	private CourseRepository courseRepository;
	
	
	@GetMapping("/create_course")
	public String create(Model model) {
		model.addAttribute("course", new Course());
		return "add_course";
	}
	
	@PostMapping("/save_course")
	public String saveCourse(@ModelAttribute("course")Course course,Model model) {
		
		courseRepository.save(course);
		
		model.addAttribute("courseList",courseRepository.findAll());
		return "course_list";
	}

}
