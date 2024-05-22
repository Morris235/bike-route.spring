package com.morris.bikeroutespring.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.morris.bikeroutespring.RouteRepository;
import com.morris.bikeroutespring.entity.Route;

import graphql.kickstart.tools.GraphQLQueryResolver;
import graphql.scalars.ExtendedScalars;
import graphql.schema.GraphQLScalarType;

// Root Query
@Component
public class Query implements GraphQLQueryResolver {
    private RouteRepository routeRepository;

    GraphQLScalarType longScalar = ExtendedScalars.newAliasedScalar("Long").aliasedScalar(ExtendedScalars.GraphQLLong)
            .build();

    @Autowired
    public Query(RouteRepository routeRepository) {
        this.routeRepository = routeRepository;
    }

    public Iterable<Route> findAllRoute() {
        return routeRepository.findAll();
    }

    public long countRoute() {
        return routeRepository.count();
    }
}
