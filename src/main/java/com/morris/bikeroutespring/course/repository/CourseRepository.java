package com.morris.bikeroutespring.course.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.course.entity.Course;

public interface CourseRepository extends JpaRepository<Course, UUID>{
    Course findByName(String name); 
    Course findByIdAndName(UUID id, String name);
}
