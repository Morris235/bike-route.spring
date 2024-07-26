package com.morris.bikeroutespring.user.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Entity
public class User {
    @Id
    private String id;
    private String name;
    private String birth;
    private String email;
    private String password;
    private String province;
    private String city;
    private double distance_driven;
    private String created;
    private boolean deleted;

    public User(String id, String name, String birth, String email, String password, String province, String city,
            double distance_driven, String created, boolean deleted) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.password = password;
        this.province = province;
        this.city = city;
        this.distance_driven = distance_driven;
        this.created = created;
        this.deleted = deleted;
    }
}
