package com.morris.bikeroutespring.course.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.sql.Date;
import java.util.UUID;
import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonSubTypes.Type;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class Course {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="id", updatable = false, nullable = false, length = 36)
    private UUID id;

    private String name;
    private int rate;
    private String finishTime;
    private String owner_id;
    private Date created;
    private boolean deleted;

    public Course(UUID id, String name, int rate, String finishTime, String owner_id, Date created,
            boolean deleted) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.finishTime = finishTime;
        this.owner_id = owner_id;
        this.created = created;
        this.deleted = deleted;
    }
}
