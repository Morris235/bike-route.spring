package com.morris.bikeroutespring.course.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.morris.bikeroutespring.course.entity.Course;
import com.morris.bikeroutespring.course.repository.CourseRepository;

@Controller
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    public Course constructCourse(UUID id, String name, int rate, String finishTime, String owner_id) {
        LocalDate created = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        created.format(formatter);
        Course course = new Course(id, name, rate, finishTime, owner_id, created.toString(), false);
        return course;
    }

    @QueryMapping
    public List<Course> findAllCourse() {
        return courseRepository.findAll();
    }

    @MutationMapping
    public Course createCourse(@Argument("id") UUID id, @Argument("name") String name, @Argument("rate") int rate,
            @Argument("finish_time") String finishTime, @Argument("owner_id") String owner_id) {
        Course course = constructCourse(id, name, rate, finishTime, owner_id);
        return courseRepository.save(course);
    }

    @MutationMapping
    public Course updateCourse(@Argument("id") UUID id, @Argument("name") String name, @Argument("rate") int rate,
            @Argument("finish_time") String finishTime, @Argument("owner_id") String owner_id) {
        Course course = courseRepository.findById(id).get();
        if (course == null)
            return null;
            course = constructCourse(id, name, rate, finishTime, owner_id);
        return courseRepository.save(course);
    }

    @MutationMapping
    public boolean deleteCourseById(@Argument("id") UUID id) {
        Course course = courseRepository.findById(id).get();
        if (course == null)
            return false;
        courseRepository.delete(course);
        return true;
    }
}