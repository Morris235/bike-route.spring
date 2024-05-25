package com.morris.bikeroutespring.resolver;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;
import lombok.RequiredArgsConstructor;

// Root Query? -> 작동하지 않음
@RequiredArgsConstructor
@Component
@Transactional(readOnly = true)
// @Controller
public class Query implements GraphQLQueryResolver {
    @Autowired
    private RouteRepository routeRepository;

    GraphQLScalarType longScalar = ExtendedScalars.newAliasedScalar("Long").aliasedScalar(ExtendedScalars.GraphQLLong)
            .build();

    public Query(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    @QueryMapping
    public List<Route> findAllRoutes() {
        return routeRepository.findAll();
    }

    @QueryMapping
    public Route findByName(String name) {
        return routeRepository.findByName(name);
    }

    @QueryMapping
    public Optional<Route> getRouteById(String id) {
        return routeRepository.findById(id);
    }

    @QueryMapping
    public long countRoute() {
        return routeRepository.count();
    }
}
