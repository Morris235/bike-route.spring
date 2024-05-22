package com.morris.bikeroutespring.entity;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
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
@Entity
public class Route {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String rate;
    private String finishTime;
    private String ownerId;
}
