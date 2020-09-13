package com.bestbright.onlie_course.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bestbright.onlie_course.dto.CourseDTO;
import com.bestbright.onlie_course.model.Course;
import com.bestbright.onlie_course.repository.CourseRepository;





@Service
public class CourseService implements CourseInterface {

	@Autowired
	private CourseRepository courseRepository;
	@Override
	public void saveCourse(CourseDTO coursedto) {
		// TODO Auto-generated method stub
		courseRepository.save(convertCourse(coursedto));
	}
	Course convertCourse(CourseDTO dto) {
		Course cour=new Course();
		cour.setCourse_name(dto.getCourse_name());
		cour.setCourse_description(dto.getCourse_description());
		cour.setPhotopath(dto.getPhotopath());
		return cour;
	}
}
