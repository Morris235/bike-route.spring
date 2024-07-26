package com.morris.bikeroutespring.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.user.entity.User;

public interface UserRepository extends JpaRepository<User, String> {
    User findByName(String name);
    User findByIdAndName(String id, String name);
}