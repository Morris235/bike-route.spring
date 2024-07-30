package com.morris.bikeroutespring.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, String>{
    Course findByName(String name); 
    Course findByIdAndName(String id, String name);
    // RouteEntity save(RouteEntity route);
    // RouteEntity deleteById(String id);
}
