package com.morris.bikeroutespring.web;

import org.springframework.graphql.data.method.annotation.QueryMapping;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.web.bind.annotation.RestController;

import com.morris.bikeroutespring.entity.RouteEntity;

import java.util.Collections;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class RouteController {
    @QueryMapping
    public RouteEntity route(@Argument Long id) {
        return null;
    }

    @QueryMapping
    public List<RouteEntity> routeList() {
        return Collections.emptyList();
    }
}
