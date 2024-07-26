package com.morris.bikeroutespring.user.entity;

import jakarta.persistence.Id;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)

public class User {
    @Id
    private String id;
    private String name;
    private String birth;
    private String email;
    private String password;
    private String province;
    private String city;
    private int distanceDriven;
    private String created;
    private String deleted;
    
    public User(String id, String name, String birth, String email, String password, String province, String city,
            int distanceDriven, String created, String deleted) {
        this.id = id;
        this.name = name;
        this.birth = birth;
        this.email = email;
        this.password = password;
        this.province = province;
        this.city = city;
        this.distanceDriven = distanceDriven;
        this.created = created;
        this.deleted = deleted;
    }
}
