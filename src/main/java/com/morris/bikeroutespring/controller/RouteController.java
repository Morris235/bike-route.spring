package com.morris.bikeroutespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.graphql.data.method.annotation.SchemaMapping;
import org.springframework.stereotype.Controller;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

@Controller
public class RouteController {
    @Autowired
    private RouteRepository routeRepository;
    
    @QueryMapping
    public List<Route> findAllRoutes() {
        return routeRepository.findAll();
    }

    // @SchemaMapping
    // public Route author(Route book) {
    //     return Route.getById(book.authorId());
    // }
}