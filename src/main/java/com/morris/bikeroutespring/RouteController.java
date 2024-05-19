package com.morris.bikeroutespring;

import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class RouteController {
    @QueryMapping
    public BikeRoute routeById(@Argument String id) {
        return BikeRoute.getById(id);
    }

    // @QueryMapping
    // public List<RouteEntity> routeList() {
    //     return Collections.emptyList();
    // }
}
