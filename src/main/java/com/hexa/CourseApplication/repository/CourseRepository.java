package com.hexa.CourseApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hexa.CourseApplication.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long> {

}
