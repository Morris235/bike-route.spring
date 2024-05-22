package com.morris.bikeroutespring;

import org.springframework.data.jpa.repository.JpaRepository;

import com.morris.bikeroutespring.entity.Route;

public interface RouteRepository extends JpaRepository<Route, String>{
    Route findByName(String name); 
    Route findByIdAndName(String id, String name);
    // RouteEntity save(RouteEntity route);
    // RouteEntity deleteById(String id);
}
