package com.morris.bikeroutespring.course.entity;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// /*
//     id: ID!
//     name: String!
//     rate: Int
//     finish_time: String
//     owner_id: String
// */ 

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
// @AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Course {
    @Id
    @GeneratedValue(generator = "uuid2")
    @GenericGenerator(name="uuid2", strategy = "uuid2")
    @Column(name="id", columnDefinition = "BINARY(16)")
    private UUID id;
    private String name;
    private int rate;
    private String finishTime;
    private String owner_id;
    private String created;
    private boolean deleted;

    public Course(UUID id, String name, int rate, String finishTime, String owner_id, String created,
            boolean deleted) {
        this.id = id;
        this.name = name;
        this.rate = rate;
        this.finishTime = finishTime;
        this.owner_id = owner_id;
        this.created = created;
        this.deleted = deleted;
    }

    // @Builder
    // public static Route toEntity (
    // String id,
    // String rate,
    // String finishTime,
    // String ownerId
    // ) {
    // return new Route(
    // id,
    // rate,
    // finishTime,
    // ownerId
    // );
    // }
}
