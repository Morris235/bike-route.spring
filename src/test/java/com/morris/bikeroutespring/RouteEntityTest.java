package com.morris.bikeroutespring;

import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Getter
@Setter
@Entity
public class RouteEntityTest {
    @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    private String name;
    private String rate;
    private String finishTime;
    private String ownerId;
}
