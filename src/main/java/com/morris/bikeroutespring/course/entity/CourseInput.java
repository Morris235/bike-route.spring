package com.morris.bikeroutespring.course.entity;

import java.util.UUID;

public record CourseInput(UUID id, String name, int rate, String finishTime, String owner_id) {
    
}
