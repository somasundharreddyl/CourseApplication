package com.hexa.CourseApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexa.CourseApplication.entity.Course;
import com.hexa.CourseApplication.service.CourseService;

@RequestMapping("/course")
@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@PostMapping("/add/courses")
	public ResponseEntity<Course> addCourses(@RequestBody Course course){
		Course CourseDetails=courseService.addCourses(course);
		return new ResponseEntity<>(course,HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllCourses")
	public ResponseEntity<List<Course>> getAllCourses(){
		List<Course> coursesList = courseService.getAllCourses();
		return new ResponseEntity<>(coursesList,HttpStatus.OK);
	}
	
	
	

}
