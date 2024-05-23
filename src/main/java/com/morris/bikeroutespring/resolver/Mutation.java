package com.morris.bikeroutespring.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

import graphql.kickstart.tools.GraphQLMutationResolver;

// Root Mutation
@Component
public class Mutation implements GraphQLMutationResolver{
    private RouteRepository routeRepository;

    @Autowired
    public Mutation(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    // public Route createRoute(String name) {
    //     Route route = new Route();
    //     route.setName(name);
    //     // route.save(route);
    //     return route;
    // }

    public boolean deleteRoute(String id) {
        // RouteRepository.deleteById(id);
        return true;
    }

}
