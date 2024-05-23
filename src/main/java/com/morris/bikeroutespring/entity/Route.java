package com.morris.bikeroutespring.entity;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
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
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Entity
public class Route {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String rate;
    private String finishTime;
    private String ownerId;

    public Route(String id, String rate, String finishTime, String ownerId) {
        this.id =id;
        this.rate = rate;
        this.finishTime = finishTime;
        this.ownerId = ownerId;
    }

    // @Builder
    // public static Route toEntity (
    //     String id,
    //     String rate,
    //     String finishTime,
    //     String ownerId
    // ) {
    //     return new Route(
    //         id,
    //         rate,
    //         finishTime,
    //         ownerId
    //     );
    // }
}
