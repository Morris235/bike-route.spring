package com.morris.bikeroutespring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

@Controller
public class RouteController {
    @Autowired
    private RouteRepository routeRepository;

    public Route constructRoute(String id, String name, int rate, String finishTime, String owner_id) {
        Route route = new Route(id, name, rate, finishTime, owner_id, null, false);
        return route;
    }
    
    @QueryMapping
    public List<Route> routes() {
        return routeRepository.findAll();
    }

    @MutationMapping
    public Route createRoute(@Argument("id") String id, @Argument("name") String name, @Argument("rate") int rate, @Argument("finish_time") String finishTime, @Argument("owner_id") String owner_id) {
        Route route = constructRoute(id, name, rate, finishTime, owner_id);
        return routeRepository.save(route);
    }

    @MutationMapping
    public Route updateRouteById(@Argument("id") String id, @Argument("name") String name, @Argument("rate") int rate, @Argument("finish_time") String finishTime, @Argument("owner_id") String owner_id) {
        Route route = routeRepository.findById(id).get();
        if (route == null) return null;
        route = constructRoute(id, name, rate, finishTime, owner_id);
        return routeRepository.save(route);
    }

    @MutationMapping
    public boolean deleteRouteById(@Argument("id") String id) {
        Route route = routeRepository.findById(id).get();
        if (route == null) return false;
        routeRepository.delete(route);
        return true;
    }
}