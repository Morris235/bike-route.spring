package com.morris.bikeroutespring.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

// /*
//     id: ID!
//     name: String!
//     rate: Int
//     finish_time: String
//     owner_id: String
// */ 

// @Data
// @AllArgsConstructor
// @NoArgsConstructor
// @Builder
@Getter
// @Setter
@Table(name = "ROUTE")
@Entity
public class RouteEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String rate;
    private String finishTime;
    private String ownerId;
}
