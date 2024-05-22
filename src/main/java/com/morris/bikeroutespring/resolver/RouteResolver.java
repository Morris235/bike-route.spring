package com.morris.bikeroutespring.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

import graphql.kickstart.tools.GraphQLResolver;

// field resolver
@Component
public class RouteResolver implements GraphQLResolver<Route>{
    @Autowired
    private RouteRepository routeRepository;

    public RouteResolver(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }
    
    public Route getRoute(Route route) {
        return routeRepository.findById(route.getId()).orElseThrow(null);
    }
}
