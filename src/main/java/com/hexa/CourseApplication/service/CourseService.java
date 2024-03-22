package com.hexa.CourseApplication.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexa.CourseApplication.entity.Course;
import com.hexa.CourseApplication.repository.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepo;

	public Course addCourses(Course course) {
		return courseRepo.save(course);
	}

	public List<Course> getAllCourses() {
		return courseRepo.findAll();
	}

}
